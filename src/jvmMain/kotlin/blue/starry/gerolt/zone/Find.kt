package blue.starry.gerolt.zone

fun EorzeaZone.Companion.find(name: String): EorzeaZone? {
    return EorzeaZone.values().find { name in it.label }
}
