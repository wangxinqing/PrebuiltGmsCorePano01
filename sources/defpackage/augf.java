package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: augf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class augf {
    private static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        String str2;
        int i;
        if (obj == null) {
            return;
        }
        if (obj instanceof auge) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(a(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        a(name, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        a(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        if (obj2 != null) {
                            i = Array.getLength(obj2);
                        } else {
                            i = 0;
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            a(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method name2 : cls.getMethods()) {
                String name3 = name2.getName();
                if (name3.startsWith("set")) {
                    String substring = name3.substring(3);
                    try {
                        String valueOf = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(valueOf.length() == 0 ? new String("has") : "has".concat(valueOf), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            String valueOf2 = String.valueOf(substring);
                            a(substring, cls.getMethod(valueOf2.length() == 0 ? new String("get") : "get".concat(valueOf2), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException e) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        String a = a(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(a);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String str3 = (String) obj;
            if (str3.startsWith("http") || str3.length() <= 200) {
                str2 = str3;
            } else {
                str2 = String.valueOf(str3.substring(0, 200)).concat("[...]");
            }
            int length2 = str2.length();
            StringBuilder sb = new StringBuilder(length2);
            for (int i3 = 0; i3 < length2; i3++) {
                char charAt = str2.charAt(i3);
                if (charAt >= ' ' && charAt <= '~' && charAt != '\"' && charAt != '\'') {
                    sb.append(charAt);
                } else {
                    sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                }
            }
            String sb2 = sb.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(sb2);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            stringBuffer2.append('\"');
            for (byte b : bArr) {
                byte b2 = b & 255;
                char c = (char) b2;
                if (b2 == 92 || b2 == 34) {
                    stringBuffer2.append('\\');
                    stringBuffer2.append(c);
                } else if (b2 >= 32 && b2 < Byte.MAX_VALUE) {
                    stringBuffer2.append(c);
                } else {
                    stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(b2)}));
                }
            }
            stringBuffer2.append('\"');
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }
}
