SUMMARY = "A small image just capable of allowing a device to boot \
for the Aries Embedded Boards."

IMAGE_FEATURES += "splash ssh-server-dropbear"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    ethtool \
    os-release \
    iproute2 \
    e2fsprogs \
    parted \
    u-boot-fw-utils \
    e2fsprogs-resize2fs \
    i2c-tools \
    mtd-utils \
    can-utils \
    mmc-utils \
    strace \
    htop \
    devmem2 \
    "

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
