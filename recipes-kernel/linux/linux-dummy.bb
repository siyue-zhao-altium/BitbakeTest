SUMMARY = "Dummy Linux kernel"
DESCRIPTION = "Dummy Linux kernel to satisfy dependencies when building the kernel externally."
SECTION = "kernel"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

PROVIDES += "virtual/kernel"

inherit deploy

# Allow empty packages for kernel modules and vmlinux
PACKAGES += "kernel-modules kernel-vmlinux"
ALLOW_EMPTY:kernel-modules = "1"
ALLOW_EMPTY:kernel-vmlinux = "1"
DESCRIPTION:kernel-modules = "Kernel modules meta package"
DESCRIPTION:kernel-vmlinux = "Kernel vmlinux meta package"

# Inhibit default dependencies
INHIBIT_DEFAULT_DEPS = "1"

# Set compatible host
COMPATIBLE_HOST = ".*-linux"

# Source URI

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

# Define empty tasks
do_configure() {
    :
}
do_compile() {
    :
}
do_install() {
    :
}
do_deploy() {
    :
}

# Add tasks to the build process
addtask deploy after do_install

