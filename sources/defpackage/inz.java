package defpackage;

import android.content.Context;
import android.os.PatternMatcher;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: inz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class inz extends imt {
    static final amzy d = amzy.a("/shared_prefs/adid_settings", "/shared_prefs/event_attestation_settings", "/shared_prefs/LockboxOptInSettings");

    public inz() {
        super("DeleteFilesFix", TimeUnit.MINUTES.toSeconds(5));
    }

    private static IllegalArgumentException a(String str, String str2) {
        return new IllegalArgumentException(String.format("Path incorrectly formatted [%s]. %s", new Object[]{str, str2}));
    }

    public final inb b(inb inb) {
        Log.i("DeleteFilesFix", "Preparing to possibly delete files.");
        Context context = inb.b;
        String c = awyw.a.a().c();
        int i = 3;
        if (amrk.a(c)) {
            ina d2 = inb.d();
            d2.a(this, 3);
            return d2.a();
        }
        try {
            List a = a(context, amsk.a(',').a().b().c(c));
            List c2 = amsk.a(',').a().b().c(awyw.a.a().b());
            anav j = anax.j();
            j.b((Iterable) a(context, (List) d));
            j.b((Iterable) a(context, c2));
            anax a2 = j.a();
            HashSet hashSet = new HashSet();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                a(a2, hashSet, (File) a.get(i2));
            }
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList, Collections.reverseOrder());
            if (((long) arrayList.size()) > awyw.e()) {
                int size2 = arrayList.size();
                long e = awyw.e();
                StringBuilder sb = new StringBuilder(76);
                sb.append("Too many files found to delete. Found: ");
                sb.append(size2);
                sb.append(" Max: ");
                sb.append(e);
                Log.w("DeleteFilesFix", sb.toString());
                ina d3 = inb.d();
                d3.a(this, 5);
                return d3.a();
            }
            int size3 = arrayList.size();
            String str = null;
            int i3 = 0;
            for (int i4 = 0; i4 < size3; i4++) {
                File file = (File) arrayList.get(i4);
                try {
                    String canonicalPath = file.getCanonicalPath();
                    if (str != null) {
                        if (!canonicalPath.endsWith("/") && file.isDirectory()) {
                            str = String.valueOf(str).concat("/");
                        }
                        if (!str.startsWith(canonicalPath)) {
                        }
                        str = canonicalPath;
                    }
                    if (!file.delete()) {
                        String valueOf = String.valueOf(file);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 17);
                        sb2.append("Unable to delete ");
                        sb2.append(valueOf);
                        Log.w("DeleteFilesFix", sb2.toString());
                    } else {
                        canonicalPath = str;
                    }
                    if (!file.exists() || file.isDirectory()) {
                        i3++;
                        str = canonicalPath;
                    }
                    str = canonicalPath;
                } catch (IOException e2) {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
                    sb3.append("Unable to delete ");
                    sb3.append(valueOf2);
                    Log.w("DeleteFilesFix", sb3.toString(), e2);
                    str = file.getPath();
                }
            }
            StringBuilder sb4 = new StringBuilder(26);
            sb4.append(i3);
            sb4.append(" files deleted.");
            Log.i("DeleteFilesFix", sb4.toString());
            ina d4 = inb.d();
            if (i3 < arrayList.size()) {
                i = 5;
            }
            d4.a(this, i);
            return d4.a();
        } catch (IllegalArgumentException e3) {
            Log.e("DeleteFilesFix", "Illegally formatted relative paths.", e3);
            ina d5 = inb.d();
            d5.a(this, 5);
            return d5.a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r8.equals("/cache/") != false) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.List a(android.content.Context r12, java.util.List r13) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0009:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x021c
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = defpackage.amrk.a((java.lang.String) r1)
            if (r2 != 0) goto L_0x0214
            java.lang.String r2 = "direct_boot:"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x002e
            android.content.Context r2 = defpackage.aekv.d(r12)
            r3 = 12
            java.lang.String r1 = r1.substring(r3)
            goto L_0x002f
        L_0x002e:
            r2 = r12
        L_0x002f:
            int r3 = r1.length()
            r4 = 2
            if (r3 < r4) goto L_0x020c
            r3 = 0
            char r5 = r1.charAt(r3)
            r6 = 47
            if (r5 != r6) goto L_0x020c
            boolean r5 = defpackage.amrk.a((java.lang.String) r1)
            if (r5 != 0) goto L_0x020c
            int r5 = r1.length()
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 > r7) goto L_0x020c
            java.lang.String r5 = "**"
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L_0x020c
            r5 = 1
            int r7 = r1.indexOf(r6, r5)
            if (r7 < 0) goto L_0x0204
            int r7 = r7 + 1
            java.lang.String r8 = r1.substring(r3, r7)
            java.lang.String r7 = r1.substring(r7)
            boolean r9 = defpackage.amrk.a((java.lang.String) r8)
            java.lang.String r10 = "/dir/"
            r11 = 0
            if (r9 != 0) goto L_0x011b
            int r9 = r8.hashCode()
            switch(r9) {
                case -1665474924: goto L_0x00ba;
                case -39485538: goto L_0x00b0;
                case 46489073: goto L_0x00a8;
                case 1689919964: goto L_0x009f;
                case 1779776714: goto L_0x0095;
                case 1783461255: goto L_0x008b;
                case 1878838226: goto L_0x0081;
                case 1972379517: goto L_0x0077;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x00c4
        L_0x0077:
            java.lang.String r4 = "/external_files/"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x00c4
            r4 = 3
            goto L_0x00c5
        L_0x0081:
            java.lang.String r4 = "/external_cache/"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x00c4
            r4 = 4
            goto L_0x00c5
        L_0x008b:
            java.lang.String r4 = "/files/"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x00c4
            r4 = 1
            goto L_0x00c5
        L_0x0095:
            java.lang.String r4 = "/shared_prefs/"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x00c4
            r4 = 6
            goto L_0x00c5
        L_0x009f:
            java.lang.String r9 = "/cache/"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00a8:
            boolean r4 = r8.equals(r10)
            if (r4 == 0) goto L_0x00c4
            r4 = 0
            goto L_0x00c5
        L_0x00b0:
            java.lang.String r4 = "/backup/"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x00c4
            r4 = 5
            goto L_0x00c5
        L_0x00ba:
            java.lang.String r4 = "/sqlite/"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x00c4
            r4 = 7
            goto L_0x00c5
        L_0x00c4:
            r4 = -1
        L_0x00c5:
            switch(r4) {
                case 0: goto L_0x0106;
                case 1: goto L_0x0101;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00f6;
                case 4: goto L_0x00f1;
                case 5: goto L_0x00ec;
                case 6: goto L_0x00dc;
                case 7: goto L_0x00c9;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x011c
        L_0x00c9:
            int r4 = r7.indexOf(r6)
            if (r4 >= 0) goto L_0x00db
            java.lang.String r4 = "somenotrealdatabase"
            java.io.File r4 = r2.getDatabasePath(r4)
            java.io.File r11 = r4.getParentFile()
            goto L_0x011c
        L_0x00db:
            goto L_0x011c
        L_0x00dc:
            java.io.File r11 = new java.io.File
            java.io.File r4 = r2.getFilesDir()
            java.lang.String r4 = r4.getParent()
            java.lang.String r9 = "shared_prefs/"
            r11.<init>(r4, r9)
            goto L_0x011c
        L_0x00ec:
            java.io.File r11 = defpackage.kf.c(r2)
            goto L_0x011c
        L_0x00f1:
            java.io.File r11 = r2.getExternalCacheDir()
            goto L_0x011c
        L_0x00f6:
            java.io.File r11 = r2.getExternalFilesDir(r11)
            goto L_0x011c
        L_0x00fc:
            java.io.File r11 = r2.getCacheDir()
            goto L_0x011c
        L_0x0101:
            java.io.File r11 = r2.getFilesDir()
            goto L_0x011c
        L_0x0106:
            int r4 = r7.indexOf(r6)
            if (r4 <= 0) goto L_0x011b
            java.lang.String r9 = r7.substring(r3, r4)
            int r4 = r4 + 1
            r7.substring(r4)
            java.io.File r11 = r2.getDir(r9, r3)
            goto L_0x011c
        L_0x011b:
        L_0x011c:
            if (r11 == 0) goto L_0x01df
            boolean r4 = r10.equals(r8)
            if (r4 == 0) goto L_0x012f
            int r4 = r7.indexOf(r6)
            int r4 = r4 + r5
            java.lang.String r7 = r7.substring(r4)
            goto L_0x0130
        L_0x012f:
        L_0x0130:
            java.io.File r1 = r11.getCanonicalFile()     // Catch:{ IOException -> 0x0198 }
            java.lang.String r4 = r7.trim()
            boolean r5 = defpackage.amrk.a((java.lang.String) r4)
            if (r5 != 0) goto L_0x0190
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            amsk r6 = defpackage.amsk.a((char) r6)
            amsk r6 = r6.a()
            amsk r6 = r6.b()
            java.util.List r6 = r6.c(r4)
            int r7 = r6.size()
            long r7 = (long) r7
            long r9 = defpackage.awyw.f()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0168
            a(r2, r5, r6, r1, r3)
            r0.addAll(r5)
            goto L_0x0009
        L_0x0168:
            int r12 = r6.size()
            long r0 = defpackage.awyw.f()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r2 = 92
            r13.<init>(r2)
            java.lang.String r2 = "Recursion depth too large! Proposed depth: "
            r13.append(r2)
            r13.append(r12)
            java.lang.String r12 = " exceeds limit of "
            r13.append(r12)
            r13.append(r0)
            java.lang.String r12 = r13.toString()
            java.lang.IllegalArgumentException r12 = a((java.lang.String) r4, (java.lang.String) r12)
            throw r12
        L_0x0190:
            java.lang.String r12 = "Relative file pattern should not be empty."
            java.lang.IllegalArgumentException r12 = a((java.lang.String) r4, (java.lang.String) r12)
            throw r12
        L_0x0198:
            r12 = move-exception
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 39
            r2.<init>(r0)
            java.lang.String r0 = "Unable to convert to a canonical file: "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            java.lang.String r2 = "DeleteFilesFix"
            android.util.Log.e(r2, r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r13 = java.lang.String.valueOf(r12)
            int r13 = r13.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r13 = r13 + 39
            r2.<init>(r13)
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            java.lang.IllegalArgumentException r12 = a((java.lang.String) r1, (java.lang.String) r12)
            throw r12
        L_0x01df:
            java.lang.String r12 = java.lang.String.valueOf(r8)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 32
            r13.<init>(r12)
            java.lang.String r12 = "Unable to parse root file for ["
            r13.append(r12)
            r13.append(r8)
            java.lang.String r12 = "]"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.IllegalArgumentException r12 = a((java.lang.String) r1, (java.lang.String) r12)
            throw r12
        L_0x0204:
            java.lang.String r12 = "Root file should be formatted between first and second slash. For example: /cache/"
            java.lang.IllegalArgumentException r12 = a((java.lang.String) r1, (java.lang.String) r12)
            throw r12
        L_0x020c:
            java.lang.String r12 = "Path must start with /root_file/ and be a valid file path."
            java.lang.IllegalArgumentException r12 = a((java.lang.String) r1, (java.lang.String) r12)
            throw r12
        L_0x0214:
            java.lang.String r12 = "Relative path should not be empty."
            java.lang.IllegalArgumentException r12 = a((java.lang.String) r1, (java.lang.String) r12)
            throw r12
        L_0x021c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.inz.a(android.content.Context, java.util.List):java.util.List");
    }

    private static void a(Context context, List list, List list2, File file, int i) {
        int length;
        File[] listFiles = file.listFiles(new iny(new PatternMatcher(((String) list2.get(i)).replace("*", ".*"), 2)));
        if (listFiles != null && (length = listFiles.length) != 0) {
            int i2 = i + 1;
            int i3 = 0;
            if (i2 >= list2.size()) {
                while (i3 < length) {
                    File file2 = listFiles[i3];
                    if (file2.isFile()) {
                        list.add(file2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < length) {
                File file3 = listFiles[i3];
                if (file3.isDirectory() && !file3.isHidden()) {
                    a(context, list, list2, file3, i2);
                }
                i3++;
            }
        }
    }

    private static boolean a(Set set, Set set2, File file) {
        if (set.contains(file)) {
            return false;
        }
        if (file.isFile()) {
            set2.add(file);
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            boolean z = true;
            for (File a : listFiles) {
                z &= a(set, set2, a);
            }
            if (!z) {
                return false;
            }
        }
        set2.add(file);
        return true;
    }

    public final boolean a(inb inb) {
        return awyw.a.a().a() && "/".equals(File.separator);
    }
}
