package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Pair;
import android.util.StateSet;
import android.view.MenuItem;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: ofx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofx {
    public static Drawable a(Drawable drawable, Resources resources) {
        return drawable.getConstantState().newDrawable(resources).mutate();
    }

    public static Drawable b(Drawable drawable, Context context, int i) {
        Drawable a = a(drawable, context.getResources());
        a(a, i);
        return a;
    }

    public static String c(long j) {
        StringBuilder sb = new StringBuilder(43);
        sb.append(j);
        sb.append("_gH_async_feedback_psbd");
        return sb.toString();
    }

    public static String d(long j) {
        StringBuilder sb = new StringBuilder(51);
        sb.append(j);
        sb.append("_gH_async_feedback_psbd_metrics");
        return sb.toString();
    }

    public static StateListDrawable a(Context context, int i) {
        Resources resources = context.getResources();
        Drawable a = a(kf.a(context, (int) R.drawable.quantum_ic_send_black_24), resources);
        Drawable a2 = a(a, resources);
        a2.setAlpha(100);
        Bitmap createBitmap = Bitmap.createBitmap(a2.getIntrinsicWidth(), a2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
        a2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), createBitmap);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910}, a);
        stateListDrawable.addState(StateSet.WILD_CARD, bitmapDrawable);
        a((Drawable) stateListDrawable, i);
        return stateListDrawable;
    }

    public static String b(long j) {
        StringBuilder sb = new StringBuilder(38);
        sb.append(j);
        sb.append("_gH_async_help_psd");
        return sb.toString();
    }

    private static void b(int i, String str, GoogleHelp googleHelp, Context context) {
        if (TextUtils.equals("exception", str)) {
            a(i, 139, googleHelp, context);
        } else if (TextUtils.equals("timeout", str)) {
            a(i, 140, googleHelp, context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String[] b(android.content.Context r6, java.lang.String r7, com.google.android.gms.googlehelp.GoogleHelp r8) {
        /*
            java.lang.Class<ofx> r0 = defpackage.ofx.class
            monitor-enter(r0)
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0048 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0048 }
            java.io.File r4 = r6.getFilesDir()     // Catch:{ Exception -> 0x0048 }
            java.lang.String r5 = "gH_async_psd"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0048 }
            r2.<init>(r3, r7)     // Catch:{ Exception -> 0x0048 }
            boolean r7 = r2.exists()     // Catch:{ Exception -> 0x0048 }
            if (r7 == 0) goto L_0x003c
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0048 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0048 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0048 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x0048 }
            java.lang.Object r3 = r2.readObject()     // Catch:{ all -> 0x003e }
            boolean r4 = r3 instanceof java.lang.String[]     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x0036
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x003e }
            r2.close()     // Catch:{ Exception -> 0x0048 }
            r7.close()     // Catch:{ Exception -> 0x0048 }
            monitor-exit(r0)
            return r3
        L_0x0036:
            r2.close()     // Catch:{ Exception -> 0x0048 }
            r7.close()     // Catch:{ Exception -> 0x0048 }
        L_0x003c:
            monitor-exit(r0)
            return r1
        L_0x003e:
            r3 = move-exception
            r2.close()     // Catch:{ Exception -> 0x0048 }
            r7.close()     // Catch:{ Exception -> 0x0048 }
            throw r3     // Catch:{ Exception -> 0x0048 }
        L_0x0046:
            r6 = move-exception
            goto L_0x0059
        L_0x0048:
            r7 = move-exception
            java.lang.String r2 = "gH_SharedFbUtils"
            java.lang.String r3 = "Reading async psbd file paths from file failed!"
            android.util.Log.e(r2, r3, r7)     // Catch:{ all -> 0x0046 }
            r7 = 103(0x67, float:1.44E-43)
            r2 = 142(0x8e, float:1.99E-43)
            a((int) r7, (int) r2, (com.google.android.gms.googlehelp.GoogleHelp) r8, (android.content.Context) r6)     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)
            return r1
        L_0x0059:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofx.b(android.content.Context, java.lang.String, com.google.android.gms.googlehelp.GoogleHelp):java.lang.String[]");
    }

    public static synchronized Bundle a(Context context, String str, GoogleHelp googleHelp) {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        Bundle a;
        synchronized (ofx.class) {
            try {
                File file = new File(new File(context.getFilesDir(), "gH_async_psd"), str);
                if (!file.exists()) {
                    return null;
                }
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                if (axqb.d()) {
                    a = a(a(objectInputStream.readObject()));
                    objectInputStream.close();
                } else {
                    a = a(objectInputStream.readObject());
                    objectInputStream.close();
                }
                fileInputStream.close();
                return a;
            } catch (Exception e) {
                Log.e("gH_SharedFbUtils", "Reading async psd from file failed!", e);
                if (str.endsWith("_gH_async_help_psd")) {
                    a(105, 142, googleHelp, context);
                } else if (str.endsWith("_gH_async_feedback_psd")) {
                    a(104, 142, googleHelp, context);
                }
                return null;
            } catch (Throwable th) {
                objectInputStream.close();
                fileInputStream.close();
                throw th;
            }
        }
    }

    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (String str : bundle.keySet()) {
            if (str != null) {
                String string = bundle.getString(str);
                if (string == null) {
                    string = "null";
                }
                bundle2.putString(str, string);
            }
        }
        return bundle2;
    }

    static Bundle a(Object obj) {
        if (!(obj instanceof String[][])) {
            return null;
        }
        Bundle bundle = new Bundle(r0);
        for (String[] strArr : (String[][]) obj) {
            if (strArr.length == 2) {
                bundle.putString(strArr[0], strArr[1]);
            }
        }
        return bundle;
    }

    public static File a(File file) {
        File file2 = new File(file, "reports");
        if (file2.exists() || file2.mkdirs()) {
            return file2;
        }
        Log.e("gH_SharedFbUtils", "failed to create reports directory");
        return null;
    }

    public static String a(long j) {
        StringBuilder sb = new StringBuilder(42);
        sb.append(j);
        sb.append("_gH_async_feedback_psd");
        return sb.toString();
    }

    public static String a(FileTeleporter fileTeleporter, File file) {
        Pair pair;
        if (fileTeleporter == null) {
            throw new IllegalArgumentException("FileTeleporter is null");
        } else if (TextUtils.isEmpty(fileTeleporter.b) || !fileTeleporter.b.startsWith("text")) {
            String valueOf = String.valueOf(fileTeleporter.b);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Passing data which is not text is not currently supported. You passed in data with mimeType: ") : "Passing data which is not text is not currently supported. You passed in data with mimeType: ".concat(valueOf));
        } else {
            ParcelFileDescriptor parcelFileDescriptor = fileTeleporter.a;
            if (parcelFileDescriptor == null) {
                pair = Pair.create(fileTeleporter.c, Pair.create(fileTeleporter.b, fileTeleporter.d));
            } else {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    String readUTF = dataInputStream.readUTF();
                    String readUTF2 = dataInputStream.readUTF();
                    dataInputStream.read(bArr);
                    FileTeleporter.a((Closeable) dataInputStream);
                    pair = Pair.create(readUTF2, Pair.create(readUTF, bArr));
                } catch (IOException e) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e);
                } catch (Throwable th) {
                    FileTeleporter.a((Closeable) dataInputStream);
                    throw th;
                }
            }
            new ofw(new File(file, String.valueOf((String) pair.first).concat(".txt")), pair).start();
            return (String) pair.first;
        }
    }

    public static void a(int i, int i2, GoogleHelp googleHelp, Context context) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = i - 1;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        olo.k = i2 - 1;
        olo.a = i3 | 1024;
        ojx.a(context, ((olo) o.i()).k(), googleHelp);
    }

    public static void a(int i, long j, GoogleHelp googleHelp, Context context) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = 49;
        int i2 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i2;
        olo.k = i - 1;
        int i3 = i2 | 1024;
        olo.a = i3;
        olo.a = i3 | 262144;
        olo.q = j;
        ojx.a(context, ((olo) o.i()).k(), googleHelp);
    }

    public static void a(int i, String str, GoogleHelp googleHelp, Context context) {
        if (TextUtils.equals("exception", str)) {
            a(i, 139, googleHelp, context);
        } else if (TextUtils.equals("timeout", str)) {
            a(i, 140, googleHelp, context);
        }
    }

    public static void a(long j, Bundle bundle, Context context, GoogleHelp googleHelp) {
        a(bundle, a(j), context);
        new nyt(googleHelp).a("UNKNOWN_SESSION_ID");
        if (bundle.containsKey("gms:feedback:async_feedback_psd_collection_time_ms")) {
            a(136, Long.valueOf(bundle.getString("gms:feedback:async_feedback_psd_collection_time_ms")).longValue(), googleHelp, context);
        } else if (bundle.containsKey("gms:feedback:async_feedback_psd_failure")) {
            b(104, bundle.getString("gms:feedback:async_feedback_psd_failure"), googleHelp, context);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.Serializable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(long r2, com.google.android.gms.feedback.FeedbackOptions r4, android.os.Bundle r5, android.content.Context r6, com.google.android.gms.googlehelp.GoogleHelp r7) {
        /*
            java.lang.String r0 = d(r2)
            a((android.os.Bundle) r5, (java.lang.String) r0, (android.content.Context) r6)
            java.util.List r4 = r4.h
            r0 = 0
            if (r4 == 0) goto L_0x0027
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0027
            java.io.File r0 = r6.getFilesDir()
            int r1 = r4.size()
            com.google.android.gms.feedback.FileTeleporter[] r1 = new com.google.android.gms.feedback.FileTeleporter[r1]
            java.lang.Object[] r4 = r4.toArray(r1)
            com.google.android.gms.feedback.FileTeleporter[] r4 = (com.google.android.gms.feedback.FileTeleporter[]) r4
            java.lang.String[] r0 = a((java.io.File) r0, (com.google.android.gms.feedback.FileTeleporter[]) r4)
            goto L_0x0028
        L_0x0027:
        L_0x0028:
            java.lang.String r2 = c(r2)
            if (r0 == 0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            r3 = 0
            java.lang.String[] r0 = new java.lang.String[r3]
        L_0x0032:
            a((java.io.Serializable) r0, (java.lang.String) r2, (android.content.Context) r6)
            nyt r2 = new nyt
            r2.<init>(r7)
            java.lang.String r3 = "UNKNOWN_SESSION_ID"
            r2.a(r3)
            java.lang.String r2 = "gms:feedback:async_feedback_psbd_collection_time_ms"
            boolean r3 = r5.containsKey(r2)
            if (r3 == 0) goto L_0x0059
            r3 = 135(0x87, float:1.89E-43)
            java.lang.String r2 = r5.getString(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r4 = r2.longValue()
            a((int) r3, (long) r4, (com.google.android.gms.googlehelp.GoogleHelp) r7, (android.content.Context) r6)
            return
        L_0x0059:
            java.lang.String r2 = "gms:feedback:async_feedback_psbd_failure"
            boolean r3 = r5.containsKey(r2)
            if (r3 == 0) goto L_0x006b
            r3 = 103(0x67, float:1.44E-43)
            java.lang.String r2 = r5.getString(r2)
            b(r3, r2, r7, r6)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofx.a(long, com.google.android.gms.feedback.FeedbackOptions, android.os.Bundle, android.content.Context, com.google.android.gms.googlehelp.GoogleHelp):void");
    }

    public static void a(Drawable drawable, int i) {
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public static void a(Drawable drawable, Context context, int i) {
        a(drawable, kf.b(context, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.String[][], java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.os.Bundle r7, java.lang.String r8, android.content.Context r9) {
        /*
            int r0 = r7.size()
            r1 = 2
            int[] r2 = new int[r1]
            r3 = 1
            r2[r3] = r1
            r1 = 0
            r2[r1] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.String[][] r0 = (java.lang.String[][]) r0
            java.util.Set r2 = r7.keySet()
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
        L_0x001e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0038
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = r0[r4]
            r6[r1] = r5
            r6 = r0[r4]
            java.lang.String r5 = r7.getString(r5)
            r6[r3] = r5
            int r4 = r4 + r3
            goto L_0x001e
        L_0x0038:
            a((java.io.Serializable) r0, (java.lang.String) r8, (android.content.Context) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofx.a(android.os.Bundle, java.lang.String, android.content.Context):void");
    }

    public static void a(Spannable spannable, String str, ClickableSpan clickableSpan) {
        int indexOf = spannable.toString().indexOf(str);
        int length = str.length() + indexOf;
        if (indexOf >= 0) {
            spannable.setSpan(clickableSpan, indexOf, length, 0);
        }
    }

    public static void a(MenuItem menuItem, Context context, int i) {
        menuItem.setIcon(b(menuItem.getIcon(), context, i));
    }

    public static void a(ImageView imageView, Context context, int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            imageView.setImageDrawable(b(drawable, context, i));
        }
    }

    public static void a(ErrorReport errorReport, ErrorReport errorReport2, Context context) {
        int i;
        int i2;
        int length;
        File filesDir = context.getFilesDir();
        Bundle bundle = errorReport2.D;
        if (bundle != null && bundle.size() > 0) {
            errorReport.D = new Bundle();
            for (String str : errorReport2.D.keySet()) {
                if (!TextUtils.isEmpty(errorReport2.D.getString(str))) {
                    errorReport.D.putString(str, errorReport2.D.getString(str));
                }
            }
        }
        byte[] bArr = errorReport2.v;
        if (!(bArr == null || (length = bArr.length) == 0)) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, length);
            Screenshot a = Screenshot.a(decodeByteArray);
            if (decodeByteArray != null) {
                Screenshot.a(errorReport, a);
            }
        }
        if (!TextUtils.isEmpty(errorReport2.u) && (i = errorReport2.w) > 0 && (i2 = errorReport2.x) > 0) {
            Screenshot.a(errorReport, Screenshot.a(errorReport2.u, i2, i));
        }
        if (!TextUtils.isEmpty(errorReport2.B)) {
            errorReport.B = errorReport2.B;
        }
        if (!TextUtils.isEmpty(errorReport2.b)) {
            errorReport.b = errorReport2.b;
        }
        if (errorReport2.I != null) {
            errorReport.a.crashInfo = new ApplicationErrorReport.CrashInfo();
            errorReport.a.crashInfo.throwFileName = errorReport2.J;
            errorReport.a.crashInfo.throwMethodName = errorReport2.M;
            errorReport.a.crashInfo.exceptionMessage = errorReport2.O;
            errorReport.a.crashInfo.exceptionClassName = errorReport2.I;
            errorReport.a.crashInfo.stackTrace = errorReport2.N;
            errorReport.a.crashInfo.throwClassName = errorReport2.L;
            errorReport.a.crashInfo.throwLineNumber = errorReport2.K;
            errorReport.a.type = 1;
        }
        if (!TextUtils.isEmpty(errorReport2.P)) {
            errorReport.P = errorReport2.P;
        }
        if (!TextUtils.isEmpty(errorReport2.ag)) {
            errorReport.ag = errorReport2.ag;
        }
        if (!TextUtils.isEmpty(errorReport2.Q)) {
            errorReport.Q = errorReport2.Q;
        }
        ThemeSettings themeSettings = errorReport2.Y;
        if (themeSettings != null) {
            errorReport.Y = themeSettings;
        }
        ApplicationErrorReport applicationErrorReport = errorReport2.a;
        if (applicationErrorReport != null && !TextUtils.isEmpty(applicationErrorReport.packageName)) {
            errorReport.a.packageName = errorReport2.a.packageName;
        }
        int i3 = errorReport2.c;
        if (i3 > 0) {
            errorReport.c = i3;
        }
        if (!TextUtils.isEmpty(errorReport2.d)) {
            errorReport.d = errorReport2.d;
        }
        Bitmap bitmap = errorReport2.af;
        if (!(bitmap == null && errorReport2.S == null)) {
            if (bitmap == null) {
                bitmap = errorReport2.S.a();
            }
            errorReport.T = Screenshot.a(filesDir, "reports", bitmap);
        }
        FileTeleporter[] fileTeleporterArr = errorReport2.U;
        if (!(fileTeleporterArr == null || fileTeleporterArr.length == 0)) {
            errorReport.V = a(filesDir, fileTeleporterArr);
        }
        LogOptions logOptions = errorReport2.Z;
        if (logOptions != null) {
            errorReport.Z = logOptions;
        }
        errorReport.W = errorReport2.W;
        errorReport.ae = errorReport2.ae;
    }

    public static void a(File file, String str) {
        new ofv(new File(file, str)).start();
    }

    public static void a(File file, String str, String str2) {
        File file2 = new File(file, "reports");
        String valueOf = String.valueOf(str);
        a(file2, str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2));
    }

    public static synchronized void a(Serializable serializable, String str, Context context) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        synchronized (ofx.class) {
            try {
                File file = new File(context.getFilesDir(), "gH_async_psd");
                if (!file.exists()) {
                    if (!file.mkdirs()) {
                        Log.e("gH_SharedFbUtils", "Creating the async psd dir failed!");
                        return;
                    }
                }
                fileOutputStream = new FileOutputStream(new File(file, str));
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (Exception e) {
                Log.e("gH_SharedFbUtils", "Writing data to file failed!", e);
            } catch (Throwable th) {
                objectOutputStream.close();
                fileOutputStream.close();
                throw th;
            }
        }
    }

    public static boolean a(String str, String str2) {
        for (String equals : a(str2)) {
            if (TextUtils.equals(equals, str)) {
                return true;
            }
        }
        return false;
    }

    private static String[] a(File file, FileTeleporter[] fileTeleporterArr) {
        File a = a(file);
        if (a == null) {
            return null;
        }
        for (File file2 : a.listFiles()) {
            if (file2.getName().endsWith(".txt")) {
                String valueOf = String.valueOf(file2.getName());
                Log.e("gH_SharedFbUtils", valueOf.length() == 0 ? new String("Deleting older file : ") : "Deleting older file : ".concat(valueOf));
                file2.delete();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (FileTeleporter a2 : fileTeleporterArr) {
            arrayList.add(a(a2, a));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] a(String str) {
        String[] split = TextUtils.split(str, ",");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }
        return split;
    }
}
