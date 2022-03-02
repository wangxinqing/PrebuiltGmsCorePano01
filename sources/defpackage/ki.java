package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ki extends ContentProvider {
    private static final String[] a = {"_display_name", "_size"};
    private static final File b = new File("/");
    private static final HashMap c = new HashMap();
    private kh d;

    public static Uri a(Context context, String str, File file) {
        String str2;
        kh a2 = a(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : a2.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    str2 = canonicalPath.substring(path2.length());
                } else {
                    str2 = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(a2.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str2, "/")).build();
            }
            throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.d = a(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.d.a(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r3) {
        /*
            r2 = this;
            kh r0 = r2.d
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0028
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            return r3
        L_0x0028:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.getType(android.net.Uri):java.lang.String");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        File a2 = this.d.a(uri);
        int i = 738197504;
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if ("rwt".equals(str)) {
                i = 1006632960;
            } else {
                throw new IllegalArgumentException("Invalid mode: " + str);
            }
        }
        return ParcelFileDescriptor.open(a2, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        File a2 = this.d.a(uri);
        if (strArr == null) {
            strArr = a;
        }
        String[] strArr3 = new String[r9];
        Object[] objArr = new Object[r9];
        int i = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i] = "_display_name";
                objArr[i] = a2.getName();
                i++;
            } else if ("_size".equals(str3)) {
                strArr3[i] = "_size";
                objArr[i] = Long.valueOf(a2.length());
                i++;
            }
        }
        String[] strArr4 = new String[i];
        System.arraycopy(strArr3, 0, strArr4, 0, i);
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        c.put(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011c A[ExcHandler: XmlPullParserException (r10v3 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:5:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.kh a(android.content.Context r10, java.lang.String r11) {
        /*
            java.util.HashMap r0 = c
            monitor-enter(r0)
            java.util.HashMap r1 = c     // Catch:{ all -> 0x0131 }
            java.lang.Object r1 = r1.get(r11)     // Catch:{ all -> 0x0131 }
            kh r1 = (defpackage.kh) r1     // Catch:{ all -> 0x0131 }
            if (r1 != 0) goto L_0x012e
            kh r1 = new kh     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r1.<init>(r11)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r11, r3)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r2 == 0) goto L_0x0105
            android.content.pm.PackageManager r3 = r10.getPackageManager()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r4 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r2 = r2.loadXmlMetaData(r3, r4)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r2 == 0) goto L_0x00fd
        L_0x002a:
            int r3 = r2.next()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r4 = 1
            if (r3 != r4) goto L_0x0038
            java.util.HashMap r10 = c     // Catch:{ all -> 0x0131 }
            r10.put(r11, r1)     // Catch:{ all -> 0x0131 }
            goto L_0x012f
        L_0x0038:
            r5 = 2
            if (r3 != r5) goto L_0x002a
            java.lang.String r3 = r2.getName()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r5 = "name"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r7 = "path"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r8 = "root-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r9 = 0
            if (r8 != 0) goto L_0x00b5
            java.lang.String r8 = "files-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r8 != 0) goto L_0x00b0
            java.lang.String r8 = "cache-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r8 != 0) goto L_0x00ab
            java.lang.String r8 = "external-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r8 != 0) goto L_0x00a6
            java.lang.String r8 = "external-files-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r8 == 0) goto L_0x0080
            java.io.File[] r3 = defpackage.kf.d(r10)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            int r8 = r3.length     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r8 <= 0) goto L_0x007f
            r6 = r3[r9]     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            goto L_0x00b7
        L_0x007f:
            goto L_0x00b7
        L_0x0080:
            java.lang.String r8 = "external-cache-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r8 != 0) goto L_0x009c
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r8 = "external-media-path"
            boolean r3 = r8.equals(r3)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r3 == 0) goto L_0x009b
            java.io.File[] r3 = r10.getExternalMediaDirs()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            int r8 = r3.length     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r8 <= 0) goto L_0x009b
            r6 = r3[r9]     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
        L_0x009b:
            goto L_0x00b7
        L_0x009c:
            java.io.File[] r3 = defpackage.kf.b(r10)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            int r8 = r3.length     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r8 <= 0) goto L_0x00a5
            r6 = r3[r9]     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
        L_0x00a5:
            goto L_0x00b7
        L_0x00a6:
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            goto L_0x00b7
        L_0x00ab:
            java.io.File r6 = r10.getCacheDir()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            goto L_0x00b7
        L_0x00b0:
            java.io.File r6 = r10.getFilesDir()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            goto L_0x00b7
        L_0x00b5:
            java.io.File r6 = b     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
        L_0x00b7:
            if (r6 == 0) goto L_0x002a
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r3[r9] = r7     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r7 = 0
        L_0x00be:
            if (r7 <= 0) goto L_0x00f1
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r3 != 0) goto L_0x00e9
            java.io.File r3 = r6.getCanonicalFile()     // Catch:{ IOException -> 0x00d1, XmlPullParserException -> 0x011c }
            java.util.HashMap r4 = r1.b     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r4.put(r5, r3)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            goto L_0x002a
        L_0x00d1:
            r10 = move-exception
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r1.<init>()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r2 = "Failed to resolve canonical path for "
            r1.append(r2)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r1.append(r6)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r11.<init>(r1, r10)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            throw r11     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
        L_0x00e9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r11 = "Name must not be empty"
            r10.<init>(r11)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            throw r10     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
        L_0x00f1:
            r7 = r3[r9]     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            if (r7 == 0) goto L_0x00fb
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r8.<init>(r6, r7)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r6 = r8
        L_0x00fb:
            r7 = 1
            goto L_0x00be
        L_0x00fd:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r11 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r10.<init>(r11)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            throw r10     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
        L_0x0105:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r1.<init>()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r2 = "Couldn't find meta-data for provider with authority "
            r1.append(r2)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r1.append(r11)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            java.lang.String r11 = r1.toString()     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            r10.<init>(r11)     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
            throw r10     // Catch:{ IOException -> 0x0125, XmlPullParserException -> 0x011c }
        L_0x011c:
            r10 = move-exception
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0131 }
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r11.<init>(r1, r10)     // Catch:{ all -> 0x0131 }
            throw r11     // Catch:{ all -> 0x0131 }
        L_0x0125:
            r10 = move-exception
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0131 }
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r11.<init>(r1, r10)     // Catch:{ all -> 0x0131 }
            throw r11     // Catch:{ all -> 0x0131 }
        L_0x012e:
        L_0x012f:
            monitor-exit(r0)     // Catch:{ all -> 0x0131 }
            return r1
        L_0x0131:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0131 }
            goto L_0x0135
        L_0x0134:
            throw r10
        L_0x0135:
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.a(android.content.Context, java.lang.String):kh");
    }
}
