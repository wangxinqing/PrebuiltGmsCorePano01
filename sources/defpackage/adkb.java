package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: adkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkb {
    private static final iwd a = adnt.c("PackageMetadatas");
    @Deprecated
    private static final adro b = new adro("post_build_fingerprint", "");
    @Deprecated
    private static final adrk c = new adrk("post_build_timestamp", -1L);
    @Deprecated
    private static final adra d = new adra("is_downgrade_package", false);
    @Deprecated
    private static final adro e = new adro("package_type", "");
    private static final amsk f = amsk.a('|').a();

    private static adqv a(String str, Map map) {
        aucd o = adqv.g.o();
        Iterable a2 = f.a((CharSequence) amrk.b((String) map.get(str.concat("build"))));
        if (o.c) {
            o.c();
            o.c = false;
        }
        adqv adqv = (adqv) o.b;
        adqv.a();
        auab.a(a2, (List) adqv.b);
        Iterable a3 = f.a((CharSequence) amrk.b((String) map.get(str.concat("bootloader"))));
        if (o.c) {
            o.c();
            o.c = false;
        }
        adqv adqv2 = (adqv) o.b;
        if (!adqv2.a.a()) {
            adqv2.a = aucj.a(adqv2.a);
        }
        auab.a(a3, (List) adqv2.a);
        Iterable a4 = f.a((CharSequence) amrk.b((String) map.get(str.concat("radio"))));
        if (o.c) {
            o.c();
            o.c = false;
        }
        adqv adqv3 = (adqv) o.b;
        if (!adqv3.d.a()) {
            adqv3.d = aucj.a(adqv3.d);
        }
        auab.a(a4, (List) adqv3.d);
        Iterable a5 = f.a((CharSequence) amrk.b((String) map.get(str.concat("device"))));
        if (o.c) {
            o.c();
            o.c = false;
        }
        adqv adqv4 = (adqv) o.b;
        if (!adqv4.c.a()) {
            adqv4.c = aucj.a(adqv4.c);
        }
        auab.a(a5, (List) adqv4.c);
        Long a6 = aook.a(amrk.b((String) map.get(str.concat("timestamp"))));
        if (a6 != null) {
            o.b(a6.longValue());
        }
        String b2 = amrk.b((String) map.get(str.concat("security-patch-level")));
        if (!b2.isEmpty()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            b2.getClass();
            ((adqv) o.b).f = b2;
        }
        return (adqv) o.i();
    }

    public static boolean b(adqw adqw) {
        String a2 = jli.a("ro.build.fingerprint", "");
        if (amrk.a(a2)) {
            a.e("Unknown current build fingerprint.", new Object[0]);
            return false;
        }
        Long a3 = aook.a(jli.a("ro.build.date.utc", ""));
        if (a3 == null) {
            a.e("Invalid current build timestamp %s.", jli.a("ro.build.date.utc", ""));
            return false;
        }
        adqv adqv = adqw.d;
        if (adqv == null) {
            adqv = adqv.g;
        }
        if (adqv.e.size() != 0) {
            adqv adqv2 = adqw.d;
            if (adqv2 == null) {
                adqv2 = adqv.g;
            }
            if (adqv2.b.contains(a2)) {
                adqv adqv3 = adqw.d;
                if (adqv3 == null) {
                    adqv3 = adqv.g;
                }
                if (adqv3.e.a(0) == a3.longValue()) {
                    return true;
                }
            }
            return false;
        }
        a.e("Unknown build timestamp in package metadata.", new Object[0]);
        return false;
    }

    public static boolean c(adqw adqw) {
        if (!adqw.b) {
            Long a2 = aook.a(jli.a("ro.build.date.utc", ""));
            if (a2 == null) {
                a.e("Invalid current build timestamp %s.", jli.a("ro.build.date.utc", ""));
                return false;
            }
            adqv adqv = adqw.d;
            if (adqv == null) {
                adqv = adqv.g;
            }
            if (adqv.e.size() != 0) {
                long longValue = a2.longValue();
                adqv adqv2 = adqw.d;
                if (adqv2 == null) {
                    adqv2 = adqv.g;
                }
                if (longValue > adqv2.e.a(0)) {
                    return true;
                }
                return false;
            }
            a.e("Unknown build timestamp in package metadata.", new Object[0]);
            return false;
        }
        a.c("Intentionally downgrading package.", new Object[0]);
        return false;
    }

    @Deprecated
    public static adqw a(adre adre) {
        aucd o = adqv.g.o();
        if (!amrk.a((String) adre.a((adri) b))) {
            String str = (String) adre.a((adri) b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            adqv adqv = (adqv) o.b;
            str.getClass();
            adqv.a();
            adqv.b.add(str);
        }
        if (((Long) adre.a((adri) c)).longValue() != -1) {
            o.b(((Long) adre.a((adri) c)).longValue());
        }
        aucd o2 = adqw.e.o();
        String str2 = (String) adre.a((adri) e);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        str2.getClass();
        ((adqw) o2.b).a = str2;
        boolean booleanValue = ((Boolean) adre.a((adri) d)).booleanValue();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((adqw) o2.b).b = booleanValue;
        adqv adqv2 = adqv.g;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        adqw adqw = (adqw) o2.b;
        adqv2.getClass();
        adqw.c = adqv2;
        adqv adqv3 = (adqv) o.i();
        adqv3.getClass();
        adqw.d = adqv3;
        return (adqw) o2.i();
    }

    public static adqw a(File file) {
        return a(a((Reader) new FileReader(file)));
    }

    private static adqw a(Map map) {
        aucd o = adqw.e.o();
        String b2 = amrk.b((String) map.get("ota-type"));
        if (o.c) {
            o.c();
            o.c = false;
        }
        b2.getClass();
        ((adqw) o.b).a = b2;
        boolean equals = "yes".equals(map.get("ota-downgrade"));
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((adqw) o.b).b = equals;
        adqv a2 = a("pre-", map);
        if (o.c) {
            o.c();
            o.c = false;
        }
        a2.getClass();
        ((adqw) o.b).c = a2;
        adqv a3 = a("post-", map);
        if (o.c) {
            o.c();
            o.c = false;
        }
        a3.getClass();
        ((adqw) o.b).d = a3;
        return (adqw) o.i();
    }

    public static adqw a(ZipFile zipFile) {
        ZipEntry entry = zipFile.getEntry("META-INF/com/android/metadata");
        if (entry != null) {
            InputStream inputStream = zipFile.getInputStream(entry);
            if (inputStream != null) {
                return a(a((Reader) new InputStreamReader(inputStream)));
            }
            throw new IOException("Unable to get input stream.");
        }
        throw new IOException("Unable to find METADATA file.");
    }

    private static Map a(Reader reader) {
        BufferedReader bufferedReader = new BufferedReader(reader);
        HashMap hashMap = new HashMap();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return hashMap;
            }
            String d2 = amql.b.d(readLine);
            if (!d2.isEmpty() && d2.charAt(0) != '#') {
                String[] split = d2.split("=");
                if (split.length != 2) {
                    a.e("Mal-formatted line: %s.", d2);
                } else {
                    hashMap.put(amql.b.d(split[0]), amql.b.d(split[1]));
                }
            }
        }
    }

    public static boolean a(adqw adqw) {
        return "BRICK".equalsIgnoreCase(adqw.a);
    }
}
