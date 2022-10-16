package be.ninedocteur.docmod.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinds {
    public static final String KEY_CATEGORY = "key.category.docmod";
    public static final String KEY_DEVMODE = "key.docmod.dev_mod";

    public static final String KEY_ENTER = "key.docmod.enter";

    public static final KeyMapping DEV_MODE_KEY = new KeyMapping(KEY_DEVMODE, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_U, KEY_CATEGORY);

    public static final KeyMapping ENTER_KEY = new KeyMapping(KEY_ENTER, KeyConflictContext.UNIVERSAL, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_ENTER, KEY_CATEGORY);
}
