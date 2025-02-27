SUMMARY = "Dummy Compiler Libraries provider to satisfy virtual/x86_64-poky-linux-compilerlibs"
LICENSE = "CLOSED"
PR = "r0"

PROVIDES += "virtual/x86_64-poky-linux-compilerlibs"

do_compile[noexec] = "1"
do_install[noexec] = "1"

