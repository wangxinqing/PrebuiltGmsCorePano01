package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: yki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yki {
    public static final Object a = new Object();
    private static final jjg b = jjg.a(iyc.PLATFORM_CONFIGURATOR);
    private final yey c;
    private final ContentResolver d;
    private final Context e;
    private final ykl f;

    public yki(yey yey, Context context, ykl ykl) {
        this.c = yey;
        this.e = context;
        this.d = context.getContentResolver();
        this.f = ykl;
    }

    private static int a(int i) {
        return (i >> 27) ^ (i << 5);
    }

    private final void b(int i, Configurations configurations, String str, String str2) {
        String str3;
        int i2 = i;
        Configurations configurations2 = configurations;
        String str4 = str;
        String str5 = str2;
        String str6 = "hash";
        String str7 = "snapshotToken1";
        String str8 = "implement non-default system storage";
        if (!ykg.b()) {
            TreeSet a2 = ykl.a(a(this.d, str4, str5));
            TreeSet treeSet = new TreeSet(a2);
            TreeSet<String> treeSet2 = !configurations2.f ? new TreeSet<>(a2) : new TreeSet<>();
            Iterator it = configurations2.e.entrySet().iterator();
            boolean z = false;
            while (true) {
                str3 = "c";
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() != 0) {
                    ((anih) ((anih) b.b()).a("yki", str3, 173, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a(str8);
                    it = it;
                } else {
                    Iterator it2 = it;
                    String[] strArr = ((Configuration) entry.getValue()).c;
                    int length = strArr.length;
                    int i3 = 0;
                    while (i3 < length) {
                        int i4 = length;
                        String str9 = strArr[i3];
                        a2.remove(str9);
                        treeSet2.add(str9);
                        i3++;
                        length = i4;
                        z = true;
                    }
                    Flag[] flagArr = ((Configuration) entry.getValue()).b;
                    int length2 = flagArr.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        int i6 = length2;
                        Flag flag = flagArr[i5];
                        Flag[] flagArr2 = flagArr;
                        treeSet2.remove(flag.a);
                        if (a2.add(flag.a)) {
                            treeSet.add(flag.a);
                            z = true;
                        }
                        i5++;
                        length2 = i6;
                        flagArr = flagArr2;
                    }
                    it = it2;
                }
            }
            if (z) {
                a(this.d, str4, ykl.a((Set) treeSet), str5);
            }
            if (!configurations2.f) {
                a2.clear();
                z = true;
            }
            Iterator it3 = configurations2.e.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                if (((Integer) entry2.getKey()).intValue() != 0) {
                    ((anih) ((anih) b.d()).a("yki", str3, 204, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a(str8);
                } else {
                    Flag[] flagArr3 = ((Configuration) entry2.getValue()).b;
                    int length3 = flagArr3.length;
                    Iterator it4 = it3;
                    int i7 = 0;
                    while (i7 < length3) {
                        String str10 = str3;
                        Flag flag2 = flagArr3[i7];
                        Flag[] flagArr4 = flagArr3;
                        int i8 = length3;
                        String str11 = str8;
                        a(this.d, flag2.a, flag2.f(), str5);
                        if (!configurations2.f) {
                            a2.add(flag2.a);
                        }
                        i7++;
                        str3 = str10;
                        flagArr3 = flagArr4;
                        length3 = i8;
                        str8 = str11;
                    }
                    String str12 = str8;
                    String str13 = str3;
                    it3 = it4;
                }
            }
            for (String a3 : treeSet2) {
                a(this.d, a3, (String) null, str5);
            }
            if (z) {
                a(this.d, str4, ykl.a((Set) a2), str5);
            }
            this.f.a(i2, str5, str7, configurations2.a);
            this.f.a(i2, str5, str6, c(str4, str5));
            return;
        }
        String str14 = str8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeSet a4 = ykl.a(a(this.d, str4, str5));
        TreeSet treeSet3 = new TreeSet(a4);
        TreeSet<String> treeSet4 = !configurations2.f ? new TreeSet<>(a4) : new TreeSet<>();
        Iterator it5 = configurations2.e.entrySet().iterator();
        boolean z2 = false;
        while (it5.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it5.next();
            if (((Integer) entry3.getKey()).intValue() != 0) {
                ((anih) ((anih) b.b()).a("yki", "d", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a(str14);
                it5 = it5;
                str6 = str6;
            } else {
                String str15 = str6;
                Iterator it6 = it5;
                String str16 = str14;
                String[] strArr2 = ((Configuration) entry3.getValue()).c;
                int length4 = strArr2.length;
                boolean z3 = z2;
                int i9 = 0;
                while (i9 < length4) {
                    int i10 = length4;
                    String str17 = strArr2[i9];
                    a4.remove(str17);
                    treeSet4.add(str17);
                    i9++;
                    length4 = i10;
                    z3 = true;
                }
                Flag[] flagArr5 = ((Configuration) entry3.getValue()).b;
                int length5 = flagArr5.length;
                int i11 = 0;
                while (i11 < length5) {
                    int i12 = length5;
                    Flag flag3 = flagArr5[i11];
                    Flag[] flagArr6 = flagArr5;
                    treeSet4.remove(flag3.a);
                    if (a4.add(flag3.a)) {
                        treeSet3.add(flag3.a);
                        z3 = true;
                    }
                    i11++;
                    length5 = i12;
                    flagArr5 = flagArr6;
                }
                str14 = str16;
                it5 = it6;
                str6 = str15;
                z2 = z3;
            }
        }
        String str18 = str6;
        String str19 = str14;
        if (z2) {
            a(this.d, str4, ykl.a((Set) treeSet3), str5);
        }
        if (!configurations2.f) {
            a4.clear();
            z2 = true;
        }
        Iterator it7 = configurations2.e.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it7.next();
            if (((Integer) entry4.getKey()).intValue() != 0) {
                ((anih) ((anih) b.d()).a("yki", "d", 284, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a(str19);
                it7 = it7;
            } else {
                Iterator it8 = it7;
                Flag[] flagArr7 = ((Configuration) entry4.getValue()).b;
                int length6 = flagArr7.length;
                String str20 = str19;
                int i13 = 0;
                while (i13 < length6) {
                    int i14 = length6;
                    Flag flag4 = flagArr7[i13];
                    Flag[] flagArr8 = flagArr7;
                    String str21 = str7;
                    linkedHashMap.put(flag4.a, flag4.f());
                    if (!configurations2.f) {
                        a4.add(flag4.a);
                    }
                    i13++;
                    length6 = i14;
                    flagArr7 = flagArr8;
                    str7 = str21;
                }
                String str22 = str7;
                it7 = it8;
                str19 = str20;
            }
        }
        String str23 = str7;
        for (String put : treeSet4) {
            linkedHashMap.put(put, (Object) null);
        }
        if (z2) {
            linkedHashMap.put(str4, ykl.a((Set) a4));
        }
        int i15 = 247715873;
        for (String str24 : ykl.a(a(this.d, str4, str5))) {
            String str25 = (String) linkedHashMap.get(str24);
            if (str25 == null) {
                str25 = a(this.d, str24, str5);
            }
            if ("null".equals(str25)) {
                str25 = null;
            }
            i15 = a(a(i15) ^ str24.hashCode()) ^ Arrays.hashCode(new Object[]{str25});
        }
        int i16 = 0;
        String num = Integer.toString(i15);
        String a5 = this.f.a(i2, str5, "banned_integrity_hash");
        if (num == null || !num.equals(a5)) {
            for (String str26 : linkedHashMap.keySet()) {
                a(this.d, str26, (String) linkedHashMap.get(str26), str5);
            }
            if (ykg.a() && str5 != null) {
                int i17 = ykh.a + 1;
                if (i17 != 50) {
                    i16 = i17;
                }
                ykh.a = i16;
                int i18 = ykh.a;
                StringBuilder sb = new StringBuilder(37);
                sb.append("recently_updated_namespace");
                sb.append(i18);
                ykg.a("rescue_party_namespace", sb.toString(), str5, true);
                TreeSet a6 = ykl.a(ykg.a("rescue_party_namespace", "all_known_namespaces"));
                if (!a6.contains(str5)) {
                    a6.add(str5);
                    ykg.a("rescue_party_namespace", "all_known_namespaces", ykl.a((Set) a6), true);
                }
            }
            ((anih) ((anih) b.d()).a("yki", "d", 319, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully applied the new configuration without tag");
            this.f.a(i2, str5, str23, configurations2.a);
            this.f.a(i2, str5, str18, num);
            return;
        }
        ((anih) ((anih) b.d()).a("yki", "d", 309, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("New flag configuration is banned, exiting without applying config changes");
    }

    private final String c(String str, String str2) {
        int i = 247715873;
        for (String str3 : ykl.a(a(this.d, str, str2))) {
            i = a(a(i) ^ str3.hashCode()) ^ Arrays.hashCode(new Object[]{a(this.d, str3, str2)});
        }
        return Integer.toString(i);
    }

    private final void d(int i, Configurations configurations, String str, String str2) {
        String str3;
        int i2;
        int i3 = i;
        Configurations configurations2 = configurations;
        String str4 = str;
        String str5 = str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeSet a2 = ykl.a(a(this.d, str4, str5));
        TreeSet treeSet = new TreeSet(a2);
        TreeSet<String> treeSet2 = !configurations2.f ? new TreeSet<>(a2) : new TreeSet<>();
        Iterator it = configurations2.e.entrySet().iterator();
        boolean z = false;
        while (true) {
            str3 = "implement non-default system storage";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getKey()).intValue() != 0) {
                ((anih) ((anih) b.b()).a("yki", "d", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a(str3);
                int i4 = i;
            } else {
                String[] strArr = ((Configuration) entry.getValue()).c;
                int length = strArr.length;
                int i5 = 0;
                while (i5 < length) {
                    String str6 = strArr[i5];
                    a2.remove(str6);
                    treeSet2.add(str6);
                    i5++;
                    z = true;
                }
                for (Flag flag : ((Configuration) entry.getValue()).b) {
                    treeSet2.remove(flag.a);
                    if (a2.add(flag.a)) {
                        treeSet.add(flag.a);
                        z = true;
                    }
                }
                int i6 = i;
            }
        }
        if (z) {
            a(this.d, str4, ykl.a((Set) treeSet), str5);
        }
        if (!configurations2.f) {
            a2.clear();
            z = true;
        }
        Iterator it2 = configurations2.e.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (((Integer) entry2.getKey()).intValue() != 0) {
                ((anih) ((anih) b.d()).a("yki", "d", 284, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a(str3);
            } else {
                Flag[] flagArr = ((Configuration) entry2.getValue()).b;
                int length2 = flagArr.length;
                int i7 = 0;
                while (i7 < length2) {
                    Iterator it3 = it2;
                    Flag flag2 = flagArr[i7];
                    Flag[] flagArr2 = flagArr;
                    String str7 = str3;
                    linkedHashMap.put(flag2.a, flag2.f());
                    if (!configurations2.f) {
                        a2.add(flag2.a);
                    }
                    i7++;
                    it2 = it3;
                    flagArr = flagArr2;
                    str3 = str7;
                }
                Iterator it4 = it2;
                String str8 = str3;
            }
        }
        for (String put : treeSet2) {
            linkedHashMap.put(put, (Object) null);
        }
        if (z) {
            linkedHashMap.put(str4, ykl.a((Set) a2));
        }
        int i8 = 247715873;
        for (String str9 : ykl.a(a(this.d, str4, str5))) {
            String str10 = (String) linkedHashMap.get(str9);
            if (str10 == null) {
                str10 = a(this.d, str9, str5);
            }
            if ("null".equals(str10)) {
                str10 = null;
            }
            i8 = a(a(i8) ^ str9.hashCode()) ^ Arrays.hashCode(new Object[]{str10});
        }
        String num = Integer.toString(i8);
        int i9 = i;
        String a3 = this.f.a(i9, str5, "banned_integrity_hash");
        if (num == null || !num.equals(a3)) {
            for (String str11 : linkedHashMap.keySet()) {
                a(this.d, str11, (String) linkedHashMap.get(str11), str5);
            }
            if (ykg.a() && str5 != null) {
                int i10 = ykh.a + 1;
                if (i10 != 50) {
                    i2 = i10;
                } else {
                    i2 = 0;
                }
                ykh.a = i2;
                int i11 = ykh.a;
                StringBuilder sb = new StringBuilder(37);
                sb.append("recently_updated_namespace");
                sb.append(i11);
                ykg.a("rescue_party_namespace", sb.toString(), str5, true);
                TreeSet a4 = ykl.a(ykg.a("rescue_party_namespace", "all_known_namespaces"));
                if (!a4.contains(str5)) {
                    a4.add(str5);
                    ykg.a("rescue_party_namespace", "all_known_namespaces", ykl.a((Set) a4), true);
                }
            }
            ((anih) ((anih) b.d()).a("yki", "d", 319, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully applied the new configuration without tag");
            this.f.a(i9, str5, "snapshotToken1", configurations2.a);
            this.f.a(i9, str5, "hash", num);
            return;
        }
        ((anih) ((anih) b.d()).a("yki", "d", 309, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("New flag configuration is banned, exiting without applying config changes");
    }

    private final boolean e(String str) {
        String str2;
        if (!ykg.c() || str == null) {
            if (str != null) {
                str2 = ykh.a(str);
            } else {
                str2 = "com.google.android.gms.settings.platform.boot";
            }
            Configurations a2 = a(str2, a(2, str));
            if (a2 == null) {
                return false;
            }
            boolean a3 = a(2, a2, "_boot_Phenotype_flags", "_boot_phenotype_platform_flags", str);
            if (!a3) {
                this.f.a(2, str, "snapshotToken1", (String) null);
            }
            return a3;
        }
        String g = g(str);
        if (g == null) {
            return false;
        }
        this.f.a(2, str, "snapshotToken1", g);
        if (azdd.f()) {
            return true;
        }
        this.f.a(2, str, "hash", c("_boot_Phenotype_flags", str));
        return true;
    }

    private final boolean f(String str) {
        String str2;
        if (!ykg.c() || str == null) {
            if (str != null) {
                str2 = ykh.a(str);
            } else {
                str2 = "com.google.android.gms.settings.platform";
            }
            Configurations a2 = a(str2, a(1, str));
            if (a2 == null || !a(1, a2, "Phenotype_flags", "phenotype_platform_flags", str)) {
                return false;
            }
            return b(1, str);
        }
        String g = g(str);
        return g != null && b(str, g);
    }

    private final String g(String str) {
        Configurations a2 = a(ykh.a(str), (String) null);
        if (a2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry value : a2.e.entrySet()) {
            for (Flag flag : ((Configuration) value.getValue()).b) {
                hashMap.put(flag.a, flag.f());
            }
        }
        try {
            if (ykg.a(str, (Map) hashMap)) {
                return a2.a;
            }
            return null;
        } catch (SecurityException e2) {
            anih anih = (anih) b.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("yki", "g", 563, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("setProperties failed with SecurityException");
            return null;
        }
    }

    private final Configurations a(String str, String str2) {
        try {
            return (Configurations) acws.a(this.c.a(str, "", str2), 2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            anih anih = (anih) b.c();
            anih.a(e2);
            ((anih) anih.a("yki", "a", 576, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Retrieving snapshot for %s failed", (Object) str);
            return null;
        }
    }

    private final Integer a(Context context) {
        if (!jkr.c()) {
            return null;
        }
        try {
            return Integer.valueOf(Settings.Global.getInt(context.getContentResolver(), "boot_count"));
        } catch (Settings.SettingNotFoundException e2) {
            anih anih = (anih) b.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("yki", "a", 667, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve boot count");
            return null;
        }
    }

    private final void c(int i, Configurations configurations, String str, String str2) {
        String str3;
        int i2 = i;
        Configurations configurations2 = configurations;
        String str4 = str;
        String str5 = str2;
        TreeSet a2 = ykl.a(a(this.d, str4, str5));
        TreeSet treeSet = new TreeSet(a2);
        TreeSet<String> treeSet2 = !configurations2.f ? new TreeSet<>(a2) : new TreeSet<>();
        Iterator it = configurations2.e.entrySet().iterator();
        boolean z = false;
        while (true) {
            str3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getKey()).intValue() != 0) {
                ((anih) ((anih) b.b()).a("yki", "c", 173, str3)).a("implement non-default system storage");
            } else {
                String[] strArr = ((Configuration) entry.getValue()).c;
                int length = strArr.length;
                int i3 = 0;
                while (i3 < length) {
                    String str6 = strArr[i3];
                    a2.remove(str6);
                    treeSet2.add(str6);
                    i3++;
                    z = true;
                }
                for (Flag flag : ((Configuration) entry.getValue()).b) {
                    treeSet2.remove(flag.a);
                    if (a2.add(flag.a)) {
                        treeSet.add(flag.a);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            a(this.d, str4, ykl.a((Set) treeSet), str5);
        }
        if (!configurations2.f) {
            a2.clear();
            z = true;
        }
        Iterator it2 = configurations2.e.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (((Integer) entry2.getKey()).intValue() != 0) {
                ((anih) ((anih) b.d()).a("yki", "c", 204, str3)).a("implement non-default system storage");
            } else {
                Flag[] flagArr = ((Configuration) entry2.getValue()).b;
                int length2 = flagArr.length;
                int i4 = 0;
                while (i4 < length2) {
                    Iterator it3 = it2;
                    Flag flag2 = flagArr[i4];
                    Flag[] flagArr2 = flagArr;
                    int i5 = length2;
                    String str7 = str3;
                    a(this.d, flag2.a, flag2.f(), str5);
                    if (!configurations2.f) {
                        a2.add(flag2.a);
                    }
                    i4++;
                    it2 = it3;
                    flagArr = flagArr2;
                    length2 = i5;
                    str3 = str7;
                }
                Iterator it4 = it2;
                String str8 = str3;
            }
        }
        for (String a3 : treeSet2) {
            a(this.d, a3, (String) null, str5);
        }
        if (z) {
            a(this.d, str4, ykl.a((Set) a2), str5);
        }
        this.f.a(i2, str5, "snapshotToken1", configurations2.a);
        this.f.a(i2, str5, "hash", c(str4, str5));
    }

    private static String a(ContentResolver contentResolver, String str, String str2) {
        if (str2 != null) {
            return ykg.a(str2, str);
        }
        return Settings.Global.getString(contentResolver, str);
    }

    private final void a(int i, Configurations configurations, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            TreeSet<String> a2 = ykl.a(Settings.Global.getString(this.d, str));
            if (!configurations.f) {
                Settings.Global.resetToDefaults(this.d, str2);
                for (String putString : a2) {
                    Settings.Global.putString(this.d, putString, (String) null);
                }
                a2.clear();
            }
            for (Map.Entry entry : configurations.e.entrySet()) {
                if (((Integer) entry.getKey()).intValue() != 0) {
                    ((anih) ((anih) b.b()).a("yki", "a", 128, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("implement non-default system storage");
                } else {
                    for (String str3 : ((Configuration) entry.getValue()).c) {
                        Settings.Global.putString(this.d, str3, (String) null, str2, false);
                        a2.remove(str3);
                    }
                    for (Flag flag : ((Configuration) entry.getValue()).b) {
                        Settings.Global.putString(this.d, flag.a, flag.f(), str2, false);
                        a2.add(flag.a);
                    }
                }
            }
            Settings.Global.putString(this.d, str, ykl.a((Set) a2));
            this.f.a(i, (String) null, "snapshotToken1", configurations.a);
            this.f.a(i, (String) null, "hash", c(str, (String) null));
        }
    }

    public final boolean c(String str) {
        boolean f2;
        synchronized (a) {
            f2 = f(str);
        }
        return f2;
    }

    private static void a(ContentResolver contentResolver, String str, String str2, String str3) {
        if (str3 != null) {
            ykg.a(str3, str, ykg.a(str3, str), true);
            ykg.a(str3, str, str2, false);
        } else if (Build.VERSION.SDK_INT == 28 && str2 == null && str.equals("battery_stats_constants")) {
            ((anih) ((anih) b.c()).a("yki", "a", 334, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("b/138425455");
        } else {
            Settings.Global.putString(contentResolver, str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(int i, String str) {
        String str2;
        boolean equals;
        if (!ykg.c() || !azdd.f()) {
            synchronized (a) {
                if (i != 1) {
                    str2 = "_boot_Phenotype_flags";
                } else {
                    str2 = "Phenotype_flags";
                }
                equals = c(str2, str).equals(this.f.a(i, str, "hash"));
            }
            if (!equals) {
                if (this.f.a(i, str, "snapshotToken1") != null) {
                    this.f.a(i, str, "snapshotToken1", (String) null);
                }
                return null;
            }
        }
        return this.f.a(i, str, "snapshotToken1");
    }

    public final boolean d(String str) {
        try {
            return f(str);
        } catch (ykf e2) {
            return false;
        }
    }

    public final void a() {
        int i = Settings.Global.getInt(this.d, "Phenotype_boot_count", -1);
        Integer a2 = a(this.e);
        if (a2 != null && !a2.equals(Integer.valueOf(i))) {
            synchronized (a) {
                if (ykg.a()) {
                    for (String b2 : azdd.b().a) {
                        b(2, b2);
                    }
                }
                b(2, (String) null);
                Integer a3 = a(this.e);
                if (a3 != null) {
                    try {
                        Settings.Global.putInt(this.d, "Phenotype_boot_count", a3.intValue());
                    } catch (SecurityException e2) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i, Configurations configurations, String str, String str2, String str3) {
        int i2 = i;
        Configurations configurations2 = configurations;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (str6 != null) {
            try {
                ((anih) ((anih) b.d()).a("yki", "a", 91, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("updateFromConfigurations DeviceConfig for namespace %s", (Object) str6);
                b(i2, configurations2, str4, str6);
                return true;
            } catch (SecurityException e2) {
                anih anih = (anih) b.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("yki", "a", 105, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("updateFromConfigurations failed with SecurityException");
                return false;
            }
        } else {
            String str7 = null;
            if (azdd.a.a().e()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    ((anih) ((anih) b.d()).a("yki", "a", 95, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("updateFromConfigurations using the tag API methods");
                    if (Build.VERSION.SDK_INT < 26) {
                        return true;
                    }
                    TreeSet<String> a2 = ykl.a(Settings.Global.getString(this.d, str4));
                    if (!configurations2.f) {
                        Settings.Global.resetToDefaults(this.d, str5);
                        for (String putString : a2) {
                            Settings.Global.putString(this.d, putString, (String) null);
                        }
                        a2.clear();
                    }
                    Iterator it = configurations2.e.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((Integer) entry.getKey()).intValue() != 0) {
                            ((anih) ((anih) b.b()).a("yki", "a", 128, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("implement non-default system storage");
                        } else {
                            String[] strArr = ((Configuration) entry.getValue()).c;
                            int length = strArr.length;
                            int i3 = 0;
                            while (i3 < length) {
                                String str8 = strArr[i3];
                                Settings.Global.putString(this.d, str8, (String) null, str5, false);
                                a2.remove(str8);
                                i3++;
                                it = it;
                                strArr = strArr;
                            }
                            Iterator it2 = it;
                            Flag[] flagArr = ((Configuration) entry.getValue()).b;
                            int length2 = flagArr.length;
                            int i4 = 0;
                            while (i4 < length2) {
                                Flag flag = flagArr[i4];
                                Settings.Global.putString(this.d, flag.a, flag.f(), str5, false);
                                a2.add(flag.a);
                                i4++;
                                flagArr = flagArr;
                            }
                            it = it2;
                            str7 = null;
                        }
                    }
                    Settings.Global.putString(this.d, str4, ykl.a((Set) a2));
                    this.f.a(i2, str7, "snapshotToken1", configurations2.a);
                    this.f.a(i2, str7, "hash", c(str4, str7));
                    return true;
                }
            }
            ((anih) ((anih) b.d()).a("yki", "a", 98, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("updateFromConfigurations using legacy put method");
            b(i2, configurations2, str4, (String) null);
            return true;
        }
    }

    private final boolean b(int i, String str) {
        String str2;
        synchronized (a) {
            String a2 = a(i, str);
            if (a2 == null) {
                return false;
            }
            if (str != null) {
                str2 = ykh.a(str);
            } else {
                str2 = i != 1 ? "com.google.android.gms.settings.platform.boot" : "com.google.android.gms.settings.platform";
            }
            boolean b2 = b(str2, a2);
            return b2;
        }
    }

    private final boolean b(String str, String str2) {
        try {
            acws.a(this.c.a(str2), 2000, TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            anih anih = (anih) b.c();
            anih.a(e2);
            ((anih) anih.a("yki", "b", 606, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Committing snapshot for %s failed", (Object) str);
            return false;
        }
    }

    public final boolean b(String str) {
        try {
            return e(str);
        } catch (ykf e2) {
            return false;
        }
    }

    public final boolean a(String str) {
        boolean e2;
        synchronized (a) {
            a();
            e2 = e(str);
        }
        return e2;
    }
}
