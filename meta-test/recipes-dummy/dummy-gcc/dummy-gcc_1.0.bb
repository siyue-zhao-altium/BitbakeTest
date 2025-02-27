SUMMARY = "Dummy GCC provider to satisfy virtual/x86_64-poky-linux-gcc"
LICENSE = "CLOSED"
PR = "r0"

# This recipe provides the virtual GCC dependency.
PROVIDES += "virtual/x86_64-poky-linux-gcc"

do_compile[noexec] = "1"
do_install[noexec] = "1"

