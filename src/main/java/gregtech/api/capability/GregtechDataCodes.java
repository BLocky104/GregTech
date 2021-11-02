package gregtech.api.capability;

public class GregtechDataCodes {

    // MTE implementation update codes
    public static final int INITIALIZE_MTE = -1;
    public static final int UPDATE_FRONT_FACING = -2;
    public static final int UPDATE_PAINTING_COLOR = -3;
    public static final int SYNC_MTE_TRAITS = -4;
    public static final int COVER_ATTACHED_MTE = -5;
    public static final int COVER_REMOVED_MTE = -6;
    public static final int UPDATE_COVER_DATA_MTE = -7;
    public static final int UPDATE_IS_FRAGILE = -8;

    public static final int UPDATE_OUTPUT_FACING = 100;
    public static final int UPDATE_AUTO_OUTPUT_ITEMS = 101;
    public static final int UPDATE_AUTO_OUTPUT_FLUIDS = 102;

    // Drum
    public static final int UPDATE_AUTO_OUTPUT = 560;
    public static final int SYNC_FLUID_CONTENT = -200;
    public static final int SYNC_FLUID_AMOUNT = -201;

    // Safe
    public static final int UPDATE_LOCKED_STATE = 8;
    public static final int UPDATE_CONTENTS_SEED = 9;

    // Misc TEs (Transformer, World Accelerator)
    public static final int SYNC_TILE_MODE = 100;

    // Clipboard
    public static final int UPDATE_UI = 0;
    public static final int CREATE_FAKE_UI = 1;
    public static final int MOUSE_POSITION = 2;

    // Pump
    public static final int PUMP_HEAD_LEVEL = 200;

    // Item Collector, Magic Energy Absorber, Large Boiler, Steam Oven
    public static final int IS_WORKING = 100;

    // Adjustable Transformer, Adjustable Energy Hatch, Diode
    public static final int AMP_INDEX = 101;

    // Pipe implementation update codes
    public static final int UPDATE_INSULATION_COLOR = -1;
    public static final int UPDATE_CONNECTIONS = -2;
    public static final int SYNC_COVER_IMPLEMENTATION = -3;
    public static final int UPDATE_PIPE_TYPE = -4;
    public static final int UPDATE_PIPE_MATERIAL = -5;
    public static final int UPDATE_COVER_DATA_PIPE = 0;
    public static final int COVER_ATTACHED_PIPE = 1;
    public static final int COVER_REMOVED_PIPE = 2;

    // Multiblock implementation update codes
    public static final int SYNC_CONTROLLER = 100;
    public static final int IS_ROTOR_LOOPING = 200;
    public static final int UPDATE_ROTOR_COLOR = 201;
    public static final int STRUCTURE_FORMED = 400;
    public static final int IS_TAPED = 550;
    public static final int STORE_MAINTENANCE = 551;
    public static final int STORE_TAPED = 552;
    public static final int RECIPE_MAP_INDEX = 553;
    public static final int IS_FRONT_FACE_FREE = 554;
    public static final int MAINTENANCE_MULTIPLIER = 555;

    // Multiblock Fluid Tank implementation update codes
    public static final int UPDATE_CONTROLLER_POSITION = 1;
    public static final int DEFORM_TANK = 2;
    public static final int SYNC_FLUID_CHANGE = 3;
    public static final int SYNC_TANK_SHAPE = 4;
}