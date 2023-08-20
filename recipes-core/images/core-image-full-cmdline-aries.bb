DESCRIPTION = "A console-only image with more full-featured Linux system \
functionality for the Aries Embedded Boards"

IMAGE_FEATURES += "splash ssh-server-dropbear"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    parted \
    u-boot-fw-utils \
    e2fsprogs-resize2fs \
    i2c-tools \
    mtd-utils \
    can-utils \
    strace \
    htop \
    devmem2 \
    "

inherit core-image
