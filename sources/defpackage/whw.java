package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: whw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class whw {
    public static final String[] a = {".pdf", ".txt", ".rtf", ".csv", ".docx", ".epub"};
    private static final String[] b = {".png", ".jpg", ".jpeg", ".gif", ".webp", ".bmp", ".heic", ".heif"};
    private static final String[] c = {".mp4", ".3gp", ".ts", ".webm", ".mkv"};
    private static final String[] d = {".mp3", ".3gp", ".mp4", ".m4a", ".aac", ".flac", ".gsm", ".mid", ".xmf", ".mxmf", ".rtttl", ".rtx", ".ota", ".imy", ".mkv", ".wav", ".ogg", ".mkv"};
    private static final MimeTypeMap e = MimeTypeMap.getSingleton();

    public static ParcelFileDescriptor a(Context context, Uri uri) {
        try {
            return agyz.a(context, uri, "r");
        } catch (FileNotFoundException | SecurityException e2) {
            throw new IOException(String.format("Failed to open file descriptor for uri \"%s\"", new Object[]{uri}), e2);
        }
    }

    public static long b(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            parcelFileDescriptor = a(context, uri);
            try {
                long statSize = parcelFileDescriptor.getStatSize();
                jjt.a(parcelFileDescriptor);
                return statSize;
            } catch (IOException e2) {
                e = e2;
                try {
                    anih anih = (anih) vvj.a.d();
                    anih.a((Throwable) e);
                    ((anih) anih.a("whw", "b", 191, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get the file size of uri %s.", (Object) uri);
                    jjt.a(parcelFileDescriptor);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    jjt.a(parcelFileDescriptor);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            anih anih2 = (anih) vvj.a.d();
            anih2.a((Throwable) e);
            ((anih) anih2.a("whw", "b", 191, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get the file size of uri %s.", (Object) uri);
            jjt.a(parcelFileDescriptor);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            jjt.a(parcelFileDescriptor);
            throw th;
        }
    }

    public static String c(Context context, Uri uri) {
        return a(context, uri, (String) null);
    }

    public static String d(Context context, Uri uri) {
        return b(context, uri, "application/octet-stream");
    }

    public static boolean c(String str) {
        for (String endsWith : b) {
            if (str.toLowerCase(Locale.getDefault()).endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    public static String a(Context context, Uri uri, String str) {
        String b2;
        String b3;
        Cursor a2 = tgw.a(context, uri);
        if (a2 != null) {
            try {
                String a3 = tgw.a(a2, "_display_name");
                if (TextUtils.isEmpty(a3)) {
                    a2.close();
                } else if (a(a3) != null || !"content".equals(uri.getScheme()) || (b3 = b(context.getContentResolver().getType(uri))) == null) {
                    a2.close();
                    return a3;
                } else {
                    String valueOf = String.valueOf(a3);
                    return b3.length() == 0 ? new String(valueOf) : valueOf.concat(b3);
                }
            } finally {
                a2.close();
            }
        }
        if (str == null) {
            str = d(context, uri);
        }
        String uri2 = uri.toString();
        if (uri2.contains("?") && uri2.indexOf(63) != uri2.length()) {
            String str2 = null;
            for (String str3 : uri2.substring(uri2.indexOf(63) + 1).split("&", -1)) {
                try {
                    if (str3.startsWith("fileName=")) {
                        str2 = URLDecoder.decode(str3.substring(9), "UTF-8");
                        if (str2.contains("/")) {
                            if (str2.lastIndexOf(47) != str2.length()) {
                                str2 = str2.substring(str2.lastIndexOf(47) + 1);
                            }
                        }
                    } else if (str3.startsWith("mimeType=")) {
                        str = URLDecoder.decode(str3.substring(9), "UTF-8");
                    }
                } catch (UnsupportedEncodingException e2) {
                }
            }
            if (!(str == null || (b2 = b(str)) == null || str2 == null || str2.endsWith(b2))) {
                String valueOf2 = String.valueOf(str2);
                str2 = b2.length() == 0 ? new String(valueOf2) : valueOf2.concat(b2);
            }
            if (str2 != null) {
                return str2;
            }
        }
        String a4 = a(uri);
        if (str.startsWith("image")) {
            if (c(a4)) {
                return a4;
            }
            String valueOf3 = String.valueOf(a4);
            String valueOf4 = String.valueOf(b[0]);
            return valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
        } else if (str.startsWith("video")) {
            for (String endsWith : c) {
                if (a4.toLowerCase(Locale.getDefault()).endsWith(endsWith)) {
                    return a4;
                }
            }
            String valueOf5 = String.valueOf(a4);
            String valueOf6 = String.valueOf(c[0]);
            return valueOf6.length() == 0 ? new String(valueOf5) : valueOf5.concat(valueOf6);
        } else if (!str.startsWith("audio")) {
            return a4;
        } else {
            for (String endsWith2 : d) {
                if (a4.toLowerCase(Locale.getDefault()).endsWith(endsWith2)) {
                    return a4;
                }
            }
            String valueOf7 = String.valueOf(a4);
            String valueOf8 = String.valueOf(d[0]);
            return valueOf8.length() == 0 ? new String(valueOf7) : valueOf7.concat(valueOf8);
        }
    }

    public static String b(Context context, Uri uri, String str) {
        String mimeTypeFromExtension;
        if ("content".equals(uri.getScheme())) {
            String type = context.getContentResolver().getType(uri);
            if (type != null) {
                return type;
            }
        } else if ("file".equals(uri.getScheme())) {
            String a2 = a(a(uri));
            if (TextUtils.isEmpty(a2) || (mimeTypeFromExtension = e.getMimeTypeFromExtension(a2)) == null) {
                return str;
            }
            return mimeTypeFromExtension;
        }
        return str;
    }

    public static String b(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        if (!str.contains("/") || str.indexOf(47) == str.length()) {
            str2 = null;
        } else {
            String valueOf = String.valueOf(str.substring(str.indexOf(47) + 1));
            str2 = valueOf.length() == 0 ? new String(".") : ".".concat(valueOf);
        }
        if (str.startsWith("image")) {
            for (String equals : b) {
                if (equals.equals(str2)) {
                    return str2;
                }
            }
            return b[0];
        } else if (str.startsWith("video")) {
            for (String equals2 : c) {
                if (equals2.equals(str2)) {
                    return str2;
                }
            }
            return c[0];
        } else if (!str.startsWith("audio")) {
            return null;
        } else {
            for (String equals3 : d) {
                if (equals3.equals(str2)) {
                    return str2;
                }
            }
            return d[0];
        }
    }

    public static byte[] b(File file) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                StringBuilder sb = new StringBuilder("");
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append("\n");
                    } else {
                        byte[] bytes = sb.toString().getBytes();
                        jjt.a((Closeable) bufferedReader);
                        return bytes;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    anih anih = (anih) vvj.a.c();
                    anih.a((Throwable) e);
                    ((anih) anih.a("whw", "b", 558, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ran into an issue reading file %s", (Object) file);
                    jjt.a((Closeable) bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    jjt.a((Closeable) bufferedReader2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            bufferedReader = null;
            anih anih2 = (anih) vvj.a.c();
            anih2.a((Throwable) e);
            ((anih) anih2.a("whw", "b", 558, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ran into an issue reading file %s", (Object) file);
            jjt.a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            jjt.a((Closeable) bufferedReader2);
            throw th;
        }
    }

    private static String a(Uri uri) {
        String path = uri.getPath();
        return path != null ? path.substring(path.lastIndexOf(47) + 1) : "";
    }

    public static String a(String str) {
        if (str.indexOf(46) != -1) {
            return str.substring(str.lastIndexOf(46) + 1);
        }
        return null;
    }

    public static BigDecimal a() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return new BigDecimal(Long.toString(statFs.getBlockSizeLong())).multiply(new BigDecimal(Long.toString(statFs.getAvailableBlocksLong())));
    }

    public static void a(File file, File file2) {
        if (file2.getParentFile() != null) {
            file2.getParentFile().mkdirs();
        }
        if (!file.renameTo(file2)) {
            a((InputStream) new FileInputStream(file), (OutputStream) new FileOutputStream(file2));
            file.delete();
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    private static void a(List list, Uri uri) {
        if (uri != null && !list.contains(uri)) {
            list.add(uri);
        }
    }

    private static void a(List list, File file) {
        if (file != null) {
            Uri fromFile = Uri.fromFile(file);
            if (!list.contains(fromFile)) {
                list.add(fromFile);
            }
        }
    }

    private static void a(List list, String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getAuthority() == null) {
                File file = new File(str);
                if (file.exists() && file.isFile()) {
                    parse = Uri.fromFile(file);
                } else {
                    return;
                }
            }
            if (!list.contains(parse)) {
                list.add(parse);
            }
        }
    }

    public static boolean a(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File a2 : listFiles) {
                if (!a(a2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static Uri[] a(Intent intent) {
        Object obj;
        Object obj2;
        List list;
        Uri uri;
        Uri[] uriArr;
        File file;
        File[] fileArr;
        String str;
        String[] strArr;
        Uri uri2;
        File file2;
        Bundle extras = intent.getExtras();
        String str2 = null;
        if (extras != null) {
            obj = extras.get("android.intent.extra.STREAM");
        } else {
            obj = null;
        }
        if (extras != null) {
            obj2 = extras.get("output");
        } else {
            obj2 = null;
        }
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        if (obj instanceof Uri) {
            uri = (Uri) obj;
        } else {
            uri = null;
        }
        if (obj instanceof Uri[]) {
            uriArr = (Uri[]) obj;
        } else {
            uriArr = null;
        }
        if (obj instanceof File) {
            file = (File) obj;
        } else {
            file = null;
        }
        if (obj instanceof File[]) {
            fileArr = (File[]) obj;
        } else {
            fileArr = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (obj instanceof String[]) {
            strArr = (String[]) obj;
        } else {
            strArr = null;
        }
        if (obj2 instanceof Uri) {
            uri2 = (Uri) obj2;
        } else {
            uri2 = null;
        }
        if (obj2 instanceof File) {
            file2 = (File) obj2;
        } else {
            file2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        Uri data = intent.getData();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object next : list) {
                if (next instanceof Uri) {
                    a((List) arrayList, (Uri) next);
                } else if (next instanceof File) {
                    a((List) arrayList, (File) next);
                } else if (next instanceof String) {
                    a((List) arrayList, (String) next);
                }
            }
        }
        a((List) arrayList, uri);
        if (uriArr != null) {
            for (Uri a2 : uriArr) {
                a((List) arrayList, a2);
            }
        }
        a((List) arrayList, file);
        if (fileArr != null) {
            for (File a3 : fileArr) {
                a((List) arrayList, a3);
            }
        }
        a((List) arrayList, str);
        if (strArr != null) {
            for (String a4 : strArr) {
                a((List) arrayList, a4);
            }
        }
        a((List) arrayList, uri2);
        a((List) arrayList, file2);
        a((List) arrayList, str2);
        a((List) arrayList, data);
        return (Uri[]) arrayList.toArray(new Uri[0]);
    }
}
