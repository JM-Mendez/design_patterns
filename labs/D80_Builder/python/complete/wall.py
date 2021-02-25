class Wall():
    def __init__(self, material: str, isLoadBearing: bool, isExternal: bool):
        self.material = material
        self.isLoadBearing = isLoadBearing
        self.isExternal = isExternal
