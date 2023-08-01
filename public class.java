@Mod("moonexpansion")
public class Moonexpansion {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "monnexpansion";
    public Moonexpansion() {
        MinecraftForge.EVENT_BUS.register(this);
