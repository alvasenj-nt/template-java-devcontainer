# Usamos una imagen oficial de Eclipse Temurin con Java 17 y JRE.
FROM eclipse-temurin:17-jdk

# Instala sudo y maven como root
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends maven sudo \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

# Crea un usuario 'vscode' y le da permisos de sudo sin contraseña.
# Esto es seguro en un entorno de desarrollo controlado.
RUN useradd -m -s /bin/bash vscode && echo "vscode ALL=(ALL) NOPASSWD:ALL" > /etc/sudoers.d/vscode

# Cambiamos al nuevo usuario para el resto de la construcción
USER vscode

# Establecemos el directorio de trabajo DENTRO del home del usuario
WORKDIR /home/vscode/workspace

# ---- La magia para el modo offline (como usuario vscode) ----
# Copiamos el pom.xml ya como propiedad de vscode
COPY --chown=vscode:vscode pom.xml .

# Ejecutamos la descarga de dependencias. Maven las guardará en /home/vscode/.m2
RUN --mount=type=cache,target=/home/vscode/.m2 \
    sh -c "sudo chown -R vscode:vscode /home/vscode/.m2 && mvn dependency:go-offline"

# Copiamos el resto del código como vscode
COPY --chown=vscode:vscode src ./src

CMD ["/bin/bash"]
