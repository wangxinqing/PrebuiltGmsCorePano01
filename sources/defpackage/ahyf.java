package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: ahyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyf {
    public static void a(PrintWriter printWriter, Class cls) {
        printWriter.println("");
        for (Field field : cls.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) && Modifier.isPublic(field.getModifiers())) {
                try {
                    Object obj = field.get(cls);
                    if (obj instanceof agvx) {
                        agvx agvx = (agvx) obj;
                        String b = agvx.b();
                        String valueOf = String.valueOf(agvx.c());
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 14 + String.valueOf(valueOf).length());
                        sb.append(" value of ");
                        sb.append(b);
                        sb.append(" is ");
                        sb.append(valueOf);
                        printWriter.println(sb.toString());
                    }
                } catch (Exception e) {
                }
            }
        }
    }
}
