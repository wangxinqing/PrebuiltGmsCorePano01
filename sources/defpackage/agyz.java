package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: agyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agyz {
    private static final String[] a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] b;

    static {
        String str;
        String str2;
        String[] strArr = new String[4];
        strArr[0] = "media";
        String str3 = "";
        if (Build.VERSION.SDK_INT > 25) {
            str = str3;
        } else {
            str = "com.google.android.inputmethod.latin.inputcontent";
        }
        strArr[1] = str;
        if (Build.VERSION.SDK_INT > 25) {
            str2 = str3;
        } else {
            str2 = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        strArr[2] = str2;
        if (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) {
            str3 = "com.google.android.apps.common.testing.services.storage.runfiles";
        }
        strArr[3] = str3;
        b = strArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 114(0x72, float:1.6E-43)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x0027
            r1 = 119(0x77, float:1.67E-43)
            if (r0 == r1) goto L_0x001d
            r1 = 3653(0xe45, float:5.119E-42)
            if (r0 == r1) goto L_0x0013
            goto L_0x0031
        L_0x0013:
            java.lang.String r0 = "rw"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0031
            r4 = 2
            goto L_0x0032
        L_0x001d:
            java.lang.String r0 = "w"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0031
            r4 = 1
            goto L_0x0032
        L_0x0027:
            java.lang.String r0 = "r"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0031
            r4 = 0
            goto L_0x0032
        L_0x0031:
            r4 = -1
        L_0x0032:
            if (r4 == 0) goto L_0x0040
            if (r4 == r3) goto L_0x003f
            if (r4 != r2) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L_0x003f:
            return r2
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyz.a(java.lang.String):int");
    }

    private static Uri a(Uri uri) {
        return Uri.parse(uri.toString());
    }

    @Deprecated
    public static ParcelFileDescriptor a(Context context, Uri uri, String str) {
        agyy agyy = agyy.a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri a2 = a(uri);
        String scheme = a2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openFileDescriptor(a2, str);
        }
        if ("content".equals(scheme)) {
            if (a(context, a2, a(str), agyy)) {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(a2, str);
                a((Object) openFileDescriptor);
                return openFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            ParcelFileDescriptor openFileDescriptor2 = contentResolver.openFileDescriptor(a2, str);
            try {
                a(context, openFileDescriptor2, a2, agyy);
                return openFileDescriptor2;
            } catch (FileNotFoundException e) {
                a(openFileDescriptor2, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                a(openFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
    }

    public static InputStream a(Context context, Uri uri) {
        agyy agyy = agyy.a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri a2 = a(uri);
        String scheme = a2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(a2);
        }
        if ("content".equals(scheme)) {
            if (a(context, a2, 1, agyy)) {
                InputStream openInputStream = contentResolver.openInputStream(a2);
                a((Object) openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(a2.getPath()).getCanonicalFile()), "r");
                try {
                    a(context, openFileDescriptor, a2, agyy);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e) {
                    a(openFileDescriptor, e);
                    throw e;
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e2);
                    a(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
    }

    public static OutputStream a(Context context, Uri uri, agyy agyy) {
        AssetFileDescriptor assetFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        Uri a2 = a(uri);
        String scheme = a2.getScheme();
        if ("android.resource".equals(scheme)) {
            assetFileDescriptor = contentResolver.openAssetFileDescriptor(a2, "w");
        } else if ("content".equals(scheme)) {
            if (a(context, a2, a("w"), agyy)) {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(a2, "w");
                a((Object) assetFileDescriptor);
            } else {
                throw new FileNotFoundException("Can't open content uri.");
            }
        } else if ("file".equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(a2, "w");
            a((Object) openAssetFileDescriptor);
            try {
                a(context, openAssetFileDescriptor.getParcelFileDescriptor(), a2, agyy);
                assetFileDescriptor = openAssetFileDescriptor;
            } catch (FileNotFoundException e) {
                a(openAssetFileDescriptor, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                a(openAssetFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
        }
        if (assetFileDescriptor == null) {
            return null;
        }
        try {
            return assetFileDescriptor.createOutputStream();
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Unable to create stream");
            fileNotFoundException2.initCause(e3);
            a(assetFileDescriptor, fileNotFoundException2);
            throw fileNotFoundException2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        if (r10.startsWith(r9.getCanonicalPath()) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r8, android.os.ParcelFileDescriptor r9, android.net.Uri r10, defpackage.agyy r11) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r10 = r10.getPath()
            r0.<init>(r10)
            java.lang.String r10 = r0.getCanonicalPath()
            java.io.FileDescriptor r9 = r9.getFileDescriptor()
            int r0 = android.os.Build.VERSION.SDK_INT
            agza r0 = new agza
            r0.<init>(r9)
            java.lang.Object r9 = defpackage.agzc.a(r0)
            android.system.StructStat r9 = (android.system.StructStat) r9
            agzc r6 = new agzc
            long r1 = r9.st_dev
            long r3 = r9.st_ino
            int r9 = r9.st_mode
            boolean r5 = android.system.OsConstants.S_ISLNK(r9)
            r0 = r6
            r0.<init>(r1, r3, r5)
            int r9 = android.os.Build.VERSION.SDK_INT
            agzb r9 = new agzb
            r9.<init>(r10)
            java.lang.Object r9 = defpackage.agzc.a(r9)
            android.system.StructStat r9 = (android.system.StructStat) r9
            agzc r7 = new agzc
            long r1 = r9.st_dev
            long r3 = r9.st_ino
            int r9 = r9.st_mode
            boolean r5 = android.system.OsConstants.S_ISLNK(r9)
            r0 = r7
            r0.<init>(r1, r3, r5)
            boolean r9 = r7.c
            java.lang.String r0 = "Can't open file: "
            if (r9 == 0) goto L_0x006b
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            java.lang.String r9 = java.lang.String.valueOf(r10)
            int r10 = r9.length()
            if (r10 != 0) goto L_0x0063
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0)
            goto L_0x0067
        L_0x0063:
            java.lang.String r9 = r0.concat(r9)
        L_0x0067:
            r8.<init>(r9)
            throw r8
        L_0x006b:
            long r1 = r6.a
            long r3 = r7.a
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0075
            goto L_0x0137
        L_0x0075:
            long r1 = r6.b
            long r3 = r7.b
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0137
            java.lang.String r9 = "/proc/"
            boolean r9 = r10.startsWith(r9)
            if (r9 != 0) goto L_0x011d
            java.lang.String r9 = "/data/misc/"
            boolean r9 = r10.startsWith(r9)
            if (r9 != 0) goto L_0x011d
            java.io.File r9 = defpackage.kf.a((android.content.Context) r8)
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x00a3
            java.lang.String r9 = r9.getCanonicalPath()
            boolean r9 = r10.startsWith(r9)
            if (r9 != 0) goto L_0x00a0
            goto L_0x00b3
        L_0x00a0:
            r1 = 1
            goto L_0x0114
        L_0x00a3:
            java.io.File r9 = android.os.Environment.getDataDirectory()
            java.lang.String r9 = r9.getCanonicalPath()
            boolean r9 = r10.startsWith(r9)
            if (r9 == 0) goto L_0x00b3
            r1 = 1
            goto L_0x0114
        L_0x00b3:
            int r9 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r9 < r3) goto L_0x00be
            android.content.Context r9 = r8.createDeviceProtectedStorageContext()
            goto L_0x00bf
        L_0x00be:
            r9 = 0
        L_0x00bf:
            if (r9 != 0) goto L_0x00c2
            goto L_0x00d3
        L_0x00c2:
            java.io.File r9 = defpackage.kf.a((android.content.Context) r9)
            if (r9 == 0) goto L_0x00d3
            java.lang.String r9 = r9.getCanonicalPath()
            boolean r9 = r10.startsWith(r9)
            if (r9 == 0) goto L_0x00d3
            goto L_0x00a0
        L_0x00d3:
            int r9 = android.os.Build.VERSION.SDK_INT
            agyw r9 = new agyw
            r9.<init>(r8)
            java.io.File[] r9 = a((java.util.concurrent.Callable) r9)
            int r3 = r9.length
            r4 = 0
        L_0x00e0:
            if (r4 < r3) goto L_0x0104
            agyx r9 = new agyx
            r9.<init>(r8)
            java.io.File[] r8 = a((java.util.concurrent.Callable) r9)
            int r9 = r8.length
            r3 = 0
        L_0x00ed:
            if (r3 >= r9) goto L_0x0103
            r4 = r8[r3]
            if (r4 != 0) goto L_0x00f4
            goto L_0x0100
        L_0x00f4:
            java.lang.String r4 = r4.getCanonicalPath()
            boolean r4 = r10.startsWith(r4)
            if (r4 == 0) goto L_0x0100
            r1 = 1
            goto L_0x0114
        L_0x0100:
            int r3 = r3 + 1
            goto L_0x00ed
        L_0x0103:
            goto L_0x0114
        L_0x0104:
            r5 = r9[r4]
            if (r5 != 0) goto L_0x0109
            goto L_0x011a
        L_0x0109:
            java.lang.String r5 = r5.getCanonicalPath()
            boolean r5 = r10.startsWith(r5)
            if (r5 == 0) goto L_0x011a
            r1 = 1
        L_0x0114:
            boolean r8 = r11.b
            if (r1 == r8) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            return
        L_0x011a:
            int r4 = r4 + 1
            goto L_0x00e0
        L_0x011d:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            java.lang.String r9 = java.lang.String.valueOf(r10)
            int r10 = r9.length()
            if (r10 != 0) goto L_0x012f
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0)
            goto L_0x0133
        L_0x012f:
            java.lang.String r9 = r0.concat(r9)
        L_0x0133:
            r8.<init>(r9)
            throw r8
        L_0x0137:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            java.lang.String r9 = java.lang.String.valueOf(r10)
            int r10 = r9.length()
            if (r10 != 0) goto L_0x0149
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0)
            goto L_0x014d
        L_0x0149:
            java.lang.String r9 = r0.concat(r9)
        L_0x014d:
            r8.<init>(r9)
            goto L_0x0152
        L_0x0151:
            throw r8
        L_0x0152:
            goto L_0x0151
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyz.a(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, agyy):void");
    }

    private static void a(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            a((Exception) fileNotFoundException, (Exception) e);
        }
    }

    private static void a(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            a((Exception) fileNotFoundException, (Exception) e);
        }
    }

    private static void a(Exception exc, Exception exc2) {
        int i = Build.VERSION.SDK_INT;
        apev.a((Throwable) exc, (Throwable) exc2);
    }

    private static void a(Object obj) {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }

    private static boolean a(Context context, Uri uri, int i, agyy agyy) {
        String authority = uri.getAuthority();
        int indexOf = authority.indexOf(64);
        if (indexOf >= 0) {
            authority = authority.substring(indexOf + 1);
        }
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            List<ProviderInfo> queryContentProviders = context.getPackageManager().queryContentProviders(context.getPackageName(), Process.myUid(), 0);
            if (queryContentProviders != null) {
                for (ProviderInfo providerInfo : queryContentProviders) {
                    if (authority.equals(providerInfo.authority)) {
                        return agyy.b;
                    }
                }
            }
            return true;
        } else if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            return agyy.b;
        } else {
            if (agyy.b) {
                return false;
            }
            if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0) {
                for (String equals : b) {
                    if (equals.equals(authority)) {
                        return true;
                    }
                }
                if (resolveContentProvider.exported) {
                    for (String str : a) {
                        if (str.charAt(str.length() - 1) == '.') {
                            if (resolveContentProvider.packageName.startsWith(str)) {
                                return false;
                            }
                        } else if (resolveContentProvider.packageName.equals(str)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    private static File[] a(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            if (Build.VERSION.SDK_INT < 22) {
                return new File[0];
            }
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
