package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: audz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class audz {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void a(audx audx, StringBuilder sb, int i) {
        String str;
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : audx.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                String str3 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i, a(str3), aucj.a(method2, (Object) audx, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                String str4 = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, a(str4), aucj.a(method3, (Object) audx, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(str);
            if (((Method) hashMap2.get(valueOf5.length() == 0 ? new String("set") : "set".concat(valueOf5))) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(str.substring(0, str.length() - 5));
                    if (hashMap.containsKey(valueOf6.length() == 0 ? new String("get") : "get".concat(valueOf6))) {
                    }
                }
                String valueOf7 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(str.substring(1));
                String str5 = valueOf8.length() == 0 ? new String(valueOf7) : valueOf7.concat(valueOf8);
                String valueOf9 = String.valueOf(str);
                Method method4 = (Method) hashMap.get(valueOf9.length() == 0 ? new String("get") : "get".concat(valueOf9));
                String valueOf10 = String.valueOf(str);
                Method method5 = (Method) hashMap.get(valueOf10.length() == 0 ? new String("has") : "has".concat(valueOf10));
                if (method4 != null) {
                    Object a = aucj.a(method4, (Object) audx, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) aucj.a(method5, (Object) audx, new Object[0])).booleanValue()) {
                        }
                    } else if (a instanceof Boolean) {
                        if (!((Boolean) a).booleanValue()) {
                        }
                    } else if (a instanceof Integer) {
                        if (((Integer) a).intValue() == 0) {
                        }
                    } else if (a instanceof Float) {
                        if (((Float) a).floatValue() == 0.0f) {
                        }
                    } else if (!(a instanceof Double)) {
                        if (a instanceof String) {
                            z = a.equals("");
                        } else if (a instanceof auay) {
                            z = a.equals(auay.b);
                        } else if (a instanceof audx) {
                            if (a == ((audx) a).j()) {
                            }
                        } else if ((a instanceof Enum) && ((Enum) a).ordinal() == 0) {
                        }
                        if (z) {
                        }
                    } else if (((Double) a).doubleValue() == 0.0d) {
                    }
                    a(sb, i, a(str5), a);
                }
            }
        }
        if (audx instanceof aucg) {
            Iterator d = ((aucg) audx).m.d();
            while (d.hasNext()) {
                Map.Entry entry = (Map.Entry) d.next();
                int i2 = ((auch) entry.getKey()).a;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                a(sb, i, sb2.toString(), entry.getValue());
            }
        }
        aufg aufg = ((aucj) audx).T;
        if (aufg != null) {
            for (int i3 = 0; i3 < aufg.b; i3++) {
                a(sb, i, String.valueOf(aufy.b(aufg.c[i3])), aufg.d[i3]);
            }
        }
    }

    static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                a(sb, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a2 : ((Map) obj).entrySet()) {
                a(sb, i, str, a2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(aufb.a(auay.a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof auay) {
                sb.append(": \"");
                sb.append(aufb.a((auay) obj));
                sb.append('\"');
            } else if (obj instanceof aucj) {
                sb.append(" {");
                a((aucj) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                a(sb, i4, "key", entry.getKey());
                a(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }
}
