package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: jgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jgt {
    private static int a(boolean z) {
        return z ? 2 : 3;
    }

    public static anoc a(Context context) {
        boolean z;
        aucd o = anoc.i.o();
        ContentResolver contentResolver = context.getContentResolver();
        String string = Settings.Secure.getString(contentResolver, "enabled_accessibility_services");
        boolean z2 = true;
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(":")) {
                if (str.startsWith("com.google.") || str.startsWith("com.googlecode.")) {
                    if (str.endsWith("TalkBackService")) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anoc anoc = (anoc) o.b;
                        anoc.b = 1;
                        anoc.a |= 1;
                    } else if (str.endsWith("BrailleBackService")) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anoc anoc2 = (anoc) o.b;
                        anoc2.c = 1;
                        anoc2.a |= 2;
                    } else if (str.endsWith("SwitchAccessService") || str.endsWith("SwitchControlService")) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anoc anoc3 = (anoc) o.b;
                        anoc3.d = 1;
                        anoc3.a |= 4;
                    } else if (str.endsWith("JustSpeakService") || str.endsWith("VoiceAccessService")) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anoc anoc4 = (anoc) o.b;
                        anoc4.e = 1;
                        anoc4.a |= 8;
                    }
                }
            }
        }
        try {
            if (Settings.System.getFloat(contentResolver, "font_scale") > 1.0f) {
                z = true;
            } else {
                z = false;
            }
            int a = a(z);
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoc anoc5 = (anoc) o.b;
            anoc5.f = a - 1;
            anoc5.a |= 16;
        } catch (Settings.SettingNotFoundException e) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoc anoc6 = (anoc) o.b;
            anoc6.f = 0;
            anoc6.a |= 16;
        }
        try {
            int a2 = a(Settings.Secure.getInt(contentResolver, "accessibility_display_magnification_enabled") == 1);
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoc anoc7 = (anoc) o.b;
            anoc7.g = a2 - 1;
            anoc7.a |= 32;
        } catch (Settings.SettingNotFoundException e2) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoc anoc8 = (anoc) o.b;
            anoc8.g = 0;
            anoc8.a |= 32;
        }
        try {
            if (Settings.Secure.getInt(contentResolver, "high_text_contrast_enabled") != 1) {
                z2 = false;
            }
            int a3 = a(z2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoc anoc9 = (anoc) o.b;
            anoc9.h = a3 - 1;
            anoc9.a |= 64;
        } catch (Settings.SettingNotFoundException e3) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anoc anoc10 = (anoc) o.b;
            anoc10.h = 0;
            anoc10.a |= 64;
        }
        return (anoc) o.i();
    }
}
