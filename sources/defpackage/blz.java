package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.FragmentTransaction;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/* renamed from: blz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class blz {
    static final Comparator a = new blv();
    static final Comparator b = new blw();
    public static final Comparator c = new blx();

    public static int a(aucd aucd, int i, bpd bpd) {
        amrl.b(true);
        int i2 = (-i) - 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        bpe bpe = (bpe) aucd.b;
        bpe bpe2 = bpe.f;
        bpd.getClass();
        bpe.a();
        bpe.c.add(i2, bpd);
        if (bpd.i) {
            String str = bpd.h;
            int i3 = 0;
            while (true) {
                if (i3 >= ((bpe) aucd.b).c.size()) {
                    break;
                }
                if (i3 != i2) {
                    bpd c2 = aucd.c(i3);
                    if (c2.i && str.equals(c2.h)) {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        bpe bpe3 = (bpe) aucd.b;
                        bpe3.a();
                        bpe3.c.remove(i3);
                        if (i3 < i2) {
                            return i2 - 1;
                        }
                    }
                }
                i3++;
            }
        }
        return i2;
    }

    public static File b(File file, int i) {
        return new File(file, String.format("%08x", new Object[]{Integer.valueOf(i)}));
    }

    public static void c(File file) {
        if (!file.isDirectory()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Failed to fix permissions; not a directory: ");
            sb.append(valueOf);
            Log.w("FileApkUtils", sb.toString());
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                a(file2, "n".equals(file2.getName()), 2);
            }
        }
        bma.c(file);
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            File parentFile2 = parentFile.getParentFile();
            if (parentFile2 != null) {
                bma.c(parentFile2);
            }
            bma.c(parentFile);
        }
        bma.c(file);
    }

    public static bmr a(bpf bpf) {
        if (!bpf.g.isEmpty() && !bpf.h.isEmpty()) {
            return new bmr(bpf.g, bpf.h);
        }
        String valueOf = String.valueOf(bpf.d);
        return new bmr(valueOf, valueOf);
    }

    static File a(File file, bpf bpf) {
        return new File(b(file, bpf.d), bpf.b);
    }

    static File a(File file, File file2) {
        String name = file2.getName();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 23);
        sb.append("c-");
        sb.append(name);
        sb.append("-");
        sb.append(currentTimeMillis);
        File file3 = new File(file, sb.toString());
        if (file2.renameTo(file3)) {
            return file3;
        }
        String valueOf = String.valueOf(name);
        Log.e("FileApkUtils", valueOf.length() == 0 ? new String("Failed to condemn module directory: ") : "Failed to condemn module directory: ".concat(valueOf));
        return null;
    }

    public static Integer a(File file, int i) {
        int i2 = i + ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        while (i < i2) {
            if (!b(file, i).exists()) {
                return Integer.valueOf(i);
            }
            i++;
        }
        Log.e("FileApkUtils", "No unique module IDs available");
        return null;
    }

    static String a(AssetManager assetManager, String str, File file) {
        FileOutputStream fileOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            InputStream open = assetManager.open(str);
            try {
                bps a2 = bps.a("SHA-256");
                try {
                    fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                    while (true) {
                        int read = open.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        a2.update(bArr, 0, read);
                        fileOutputStream.write(bArr, 0, read);
                    }
                    String a3 = a(a2.digest());
                    fileOutputStream.close();
                    a2.a();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                    sb.append("Spent ");
                    sb.append(currentTimeMillis2);
                    sb.append("ms copying ");
                    sb.append(str);
                    sb.append(" and computing apk ");
                    sb.append("SHA-256");
                    sb.append(".");
                    sb.toString();
                    if (open != null) {
                        open.close();
                    }
                    return a3;
                } catch (Throwable th) {
                    a2.a();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (open != null) {
                    open.close();
                }
                throw th2;
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(valueOf).length());
            sb2.append("Failed to stage asset ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(valueOf);
            Log.e("FileApkUtils", sb2.toString());
            return null;
        } catch (Throwable th3) {
            apev.a(th2, th3);
        }
    }

    static String a(File file) {
        bps a2;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                a2 = bps.a("SHA-256");
                byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        String a3 = a(a2.digest());
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        StringBuilder sb = new StringBuilder(51);
                        sb.append("Spent ");
                        sb.append(currentTimeMillis2);
                        sb.append("ms computing apk ");
                        sb.append("SHA-256");
                        sb.append(".");
                        sb.toString();
                        a2.a();
                        fileInputStream.close();
                        return a3;
                    }
                    a2.update(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException | NoSuchAlgorithmException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FileApkUtils", valueOf.length() == 0 ? new String("Failed to compute SHA-256: ") : "Failed to compute SHA-256: ".concat(valueOf));
            return null;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }

    public static String a(byte[] bArr) {
        int i;
        int i2;
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte b2 = bArr[i3];
            int i5 = (b2 >> 4) & 15;
            int i6 = i4 + 1;
            if (i5 >= 10) {
                i = i5 + 87;
            } else {
                i = i5 + 48;
            }
            cArr[i4] = (char) i;
            byte b3 = b2 & 15;
            int i7 = i6 + 1;
            if (b3 >= 10) {
                i2 = b3 + 87;
            } else {
                i2 = b3 + 48;
            }
            cArr[i6] = (char) i2;
            i3++;
            i4 = i7;
        }
        return new String(cArr);
    }

    private static void a(File file, boolean z, int i) {
        File[] listFiles;
        if (file.isDirectory()) {
            if (z) {
                bma.d(file);
            }
            bma.c(file);
            if (i > 0 && (listFiles = file.listFiles()) != null) {
                int length = listFiles.length;
                for (int i2 = 0; i2 < length; i2++) {
                    a(listFiles[i2], z, i - 1);
                }
            }
        } else if (file.isFile()) {
            bma.d(file);
            if (z) {
                bma.c(file);
            }
        }
    }

    public static void a(String str) {
        File parentFile = new File(str).getParentFile();
        if (parentFile != null) {
            File parentFile2 = parentFile.getParentFile();
            if (parentFile2 != null) {
                b(parentFile2);
            }
            if (!bma.b(parentFile)) {
                c(parentFile);
            }
        }
    }

    public static boolean a(aucd aucd) {
        ob obVar = new ob(8);
        Iterator it = Collections.unmodifiableList(((bpe) aucd.b).c).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aucx aucx = ((bpd) it.next()).e;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                obVar.add(((bpf) aucx.get(i)).c);
            }
        }
        ArrayList arrayList = new ArrayList(((bpe) aucd.b).d.size());
        boolean z = false;
        for (bpf bpf : Collections.unmodifiableList(((bpe) aucd.b).d)) {
            if (!obVar.contains(bpf.c)) {
                String str = bpf.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
                sb.append("Unreferenced module digest: [");
                sb.append(str);
                sb.append("]");
                sb.toString();
                z = true;
            } else {
                arrayList.add(bpf);
            }
        }
        if (!z) {
            return false;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        bpe bpe = bpe.f;
        ((bpe) aucd.b).d = aucj.s();
        aucd.k((Iterable) arrayList);
        return true;
    }

    static boolean a(aucd aucd, bkw bkw, Set set) {
        aucd aucd2 = aucd;
        bkw bkw2 = bkw;
        int i = 8;
        ou ouVar = new ou(8);
        ouVar.put(bkw2.a, bkw2);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bms bms = (bms) it.next();
                if (bms instanceof bmb) {
                    bmb bmb = (bmb) bms;
                    ouVar.put(bmb.a, bmb);
                }
            }
        }
        ArrayList arrayList = new ArrayList(((bpe) aucd2.b).c.size());
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (i2 < ((bpe) aucd2.b).c.size()) {
            bpd c2 = aucd2.c(i2);
            aucd aucd3 = (aucd) c2.c(5);
            aucd3.a((aucj) c2);
            bpd bpd = (bpd) aucd3.b;
            if (bpd.i) {
                String str = bpd.b;
                bmb bmb2 = (bmb) ouVar.get(bpd.h);
                if (bmb2 != null) {
                    String m = bmb2.m();
                    if (m != null && !m.equals(((bpd) aucd3.b).b)) {
                        if (m.length() == 0) {
                            new String("Staged apk new location: ");
                        } else {
                            "Staged apk new location: ".concat(m);
                        }
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        bpd bpd2 = (bpd) aucd3.b;
                        bpd bpd3 = bpd.j;
                        m.getClass();
                        int i3 = bpd2.a | 1;
                        bpd2.a = i3;
                        bpd2.b = m;
                        bpd2.a = i3 | 4;
                        bpd2.d = false;
                        for (int i4 = 0; i4 < ((bpd) aucd3.b).e.size(); i4++) {
                            bpf b2 = aucd3.b(i4);
                            aucd aucd4 = (aucd) b2.c(5);
                            aucd4.a((aucj) b2);
                            if (aucd4.c) {
                                aucd4.c();
                                aucd4.c = false;
                            }
                            bpf bpf = (bpf) aucd4.b;
                            bpf bpf2 = bpf.i;
                            bpf.a |= i;
                            bpf.e = true;
                            aucd3.a(i4, (bpf) aucd4.i());
                        }
                        z = true;
                    }
                } else {
                    int a2 = bpc.a(((bpd) aucd3.b).g);
                    if (!(a2 == 0 || a2 != 4 || set == null)) {
                        String valueOf = String.valueOf(str);
                        if (valueOf.length() == 0) {
                            new String("Staged installed APK removed: ");
                        } else {
                            "Staged installed APK removed: ".concat(valueOf);
                        }
                        z2 = true;
                        i2++;
                        i = 8;
                    }
                }
            }
            bpd bpd4 = (bpd) aucd3.b;
            if (bpd4.d) {
                Iterator it2 = Collections.unmodifiableList(bpd4.e).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Collections.binarySearch(Collections.unmodifiableList(((bpe) aucd2.b).d), (bpf) it2.next(), b) < 0) {
                        String valueOf2 = String.valueOf(((bpd) aucd3.b).b);
                        if (valueOf2.length() == 0) {
                            new String("Staging now incomplete: ");
                        } else {
                            "Staging now incomplete: ".concat(valueOf2);
                        }
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        bpd bpd5 = (bpd) aucd3.b;
                        bpd bpd6 = bpd.j;
                        bpd5.a |= 4;
                        bpd5.d = false;
                        z3 = true;
                    }
                }
            }
            int a3 = bpc.a(((bpd) aucd3.b).g);
            if (a3 != 0 && a3 == 5 && !((bpd) aucd3.b).d) {
                z2 = true;
                i2++;
                i = 8;
            } else {
                bpd bpd7 = (bpd) aucd3.i();
                aucd2.a(i2, bpd7);
                arrayList.add(bpd7);
                i2++;
                i = 8;
            }
        }
        if (z) {
            Collections.sort(arrayList, c);
        } else if (!z2) {
            return z3;
        }
        if (aucd2.c) {
            aucd.c();
            aucd2.c = false;
        }
        bpe bpe = bpe.f;
        ((bpe) aucd2.b).c = aucj.s();
        aucd2.l((Iterable) arrayList);
        return true;
    }
}
