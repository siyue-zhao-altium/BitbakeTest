SUMMARY = "Dummy Libc provider to satisfy virtual/libc"
LICENSE = "CLOSED"
PR = "r0"

PROVIDES += "virtual/libc"

do_compile[noexec] = "1"
do_install[noexec] = "1"

