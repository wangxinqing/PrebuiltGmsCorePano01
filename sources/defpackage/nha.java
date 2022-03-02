package defpackage;

import com.google.android.gms.fonts.FontMatchSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: nha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nha {
    private static final String[] a = {"", "i", "italic"};
    private static final anaf b;
    private static final Map c;

    static {
        float f;
        anab anab = new anab();
        anab.a("100", 100);
        anab.a("200", 200);
        anab.a("300", 300);
        anab.a("400", 400);
        anab.a("500", 500);
        anab.a("600", 600);
        anab.a("700", 700);
        anab.a("800", 800);
        anab.a("900", 900);
        anab.a("thin", 100);
        anab.a("extralight", 200);
        anab.a("extra-light", 200);
        anab.a("ultralight", 200);
        anab.a("ultra-light", 200);
        anab.a("light", 300);
        anab.a("regular", 400);
        anab.a("book", 400);
        anab.a("medium", 500);
        anab.a("semi-bold", 600);
        anab.a("semibold", 600);
        anab.a("demi-bold", 600);
        anab.a("demibold", 600);
        anab.a("bold", 700);
        anab.a("extra-bold", 800);
        anab.a("extrabold", 800);
        anab.a("ultra-bold", 800);
        anab.a("ultrabold", 800);
        anab.a("black", 900);
        anab.a("heavy", 900);
        anab.a("l", 300);
        anab.a("r", 400);
        anab.a("b", 700);
        anab.a("", 400);
        b = anab.a();
        HashMap hashMap = new HashMap();
        anhj a2 = b.entrySet().iterator();
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            for (String str : a) {
                String valueOf = String.valueOf((String) entry.getKey());
                String valueOf2 = String.valueOf(str);
                String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                Integer num = (Integer) entry.getValue();
                if (!str.isEmpty()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                hashMap.put(str2, amrj.a(num, Float.valueOf(f)));
            }
        }
        c = hashMap;
    }

    static int a(String str, int i) {
        try {
            return Integer.parseInt(str.substring(i));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
            sb.append("query contains invalid value (");
            sb.append(str);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static float b(String str) {
        try {
            return Float.parseFloat(str.substring(4));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
            sb.append("query contains invalid value (");
            sb.append(str);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static List a(String str) {
        FontMatchSpec fontMatchSpec;
        float f;
        int i;
        float f2;
        ArrayList arrayList;
        String str2 = str;
        if (str2 == null || str.isEmpty() || str.length() > 512) {
            throw new IllegalArgumentException("query cannot be null, empty, or over 512 characters");
        }
        char c2 = ',';
        if (str2.contains("=") || (str2.contains(",") && !str2.contains(":"))) {
            List<String> c3 = amsk.a(',').a().b().c(str2);
            ArrayList arrayList2 = new ArrayList(c3.size());
            for (String str3 : c3) {
                if (!str3.contains("=")) {
                    fontMatchSpec = new FontMatchSpec(str3);
                } else {
                    Map a2 = amsk.a('&').a(amsk.a('=').b()).a(str3);
                    String str4 = (String) a2.get("name");
                    if (str4 == null || str4.isEmpty()) {
                        throw new IllegalArgumentException("'name' parameter is required.");
                    }
                    String str5 = (String) a2.get("width");
                    String str6 = (String) a2.get("weight");
                    String str7 = (String) a2.get("italic");
                    String str8 = (String) a2.get("besteffort");
                    if (str5 != null) {
                        try {
                            f = Float.parseFloat(str5);
                        } catch (NumberFormatException e) {
                            throw new IllegalArgumentException("Invalid numerical parameter", e);
                        }
                    } else {
                        f = 100.0f;
                    }
                    if (str6 != null) {
                        i = Integer.parseInt(str6);
                    } else {
                        i = 400;
                    }
                    if (str7 != null) {
                        f2 = Float.parseFloat(str7);
                    } else {
                        f2 = 0.0f;
                    }
                    fontMatchSpec = new FontMatchSpec(str4, f, i, f2, str8 != null ? Boolean.parseBoolean(str8) : false);
                }
                arrayList2.add(fontMatchSpec);
            }
            return arrayList2;
        }
        List<String> c4 = amsk.a('|').a().b().c(str2);
        ArrayList arrayList3 = new ArrayList();
        for (String str9 : c4) {
            if (str9 == null || str9.isEmpty()) {
                throw new IllegalArgumentException("query cannot be null or empty");
            }
            if (!str9.contains(":")) {
                arrayList = anda.a((Object[]) new FontMatchSpec[]{new FontMatchSpec(str9.replace('+', ' '))});
            } else {
                char c5 = ':';
                int indexOf = str9.indexOf(58);
                String replace = str9.substring(0, indexOf).replace('+', ' ');
                String substring = str9.substring(indexOf + 1);
                ArrayList arrayList4 = new ArrayList();
                for (String c6 : amsk.a(c2).a().b().c(substring)) {
                    float f3 = 100.0f;
                    int i2 = 400;
                    float f4 = 0.0f;
                    boolean z = false;
                    for (String lowerCase : amsk.a(c5).a().b().c(c6)) {
                        String lowerCase2 = lowerCase.toLowerCase(Locale.ENGLISH);
                        amrj amrj = (amrj) c.get(lowerCase2);
                        if (amrj != null) {
                            i2 = ((Integer) amrj.a).intValue();
                            f4 = ((Float) amrj.b).floatValue();
                        } else if (lowerCase2.equals("nearest")) {
                            z = true;
                        } else if (lowerCase2.startsWith("wght")) {
                            int a3 = a(lowerCase2, 4);
                            if (a3 <= 0 || a3 > 1000) {
                                StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 32);
                                sb.append("query contains invalid weight (");
                                sb.append(lowerCase2);
                                sb.append(")");
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2 = a3;
                        } else if (lowerCase2.startsWith("ital")) {
                            f4 = b(lowerCase2);
                            if (f4 < 0.0f || f4 > 1.0f) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 38);
                                sb2.append("query contains invalid italic value (");
                                sb2.append(lowerCase2);
                                sb2.append(")");
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        } else if (lowerCase2.startsWith("wdth")) {
                            f3 = b(lowerCase2);
                            if (f3 <= 0.0f) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase2).length() + 31);
                                sb3.append("query contains invalid width (");
                                sb3.append(lowerCase2);
                                sb3.append(")");
                                throw new IllegalArgumentException(sb3.toString());
                            }
                        } else {
                            int a4 = a(lowerCase2, 0);
                            if (a4 <= 0 || a4 > 1000) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase2).length() + 32);
                                sb4.append("query contains invalid weight (");
                                sb4.append(lowerCase2);
                                sb4.append(")");
                                throw new IllegalArgumentException(sb4.toString());
                            }
                            i2 = a4;
                        }
                    }
                    arrayList4.add(new FontMatchSpec(replace, f3, i2, f4, z));
                    c5 = ':';
                }
                arrayList = arrayList4;
            }
            arrayList3.addAll(arrayList);
            c2 = ',';
        }
        return arrayList3;
    }
}
