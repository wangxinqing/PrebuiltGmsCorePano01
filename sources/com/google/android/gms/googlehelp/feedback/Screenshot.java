package com.google.android.gms.googlehelp.feedback;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Screenshot implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new oft();
    public int a;
    public int b;
    public String c;

    public static Bitmap a(byte[] bArr, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        int length = bArr.length;
        BitmapFactory.decodeByteArray(bArr, 0, length, options);
        int i2 = options.outWidth / 2;
        int i3 = options.outHeight / 2;
        if (z) {
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            if (i4 > i3 || i5 > i2) {
                i = Math.max(Math.round(((float) i4) / ((float) i3)), Math.round(((float) i5) / ((float) i2)));
            }
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, 0, length, options);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public static AsyncTask a(File file, String str, Screenshot screenshot, boolean z, ofu ofu) {
        File file2 = new File(new File(file, "reports"), String.valueOf(str).concat(".bmp"));
        if (!file2.exists() || !file2.canRead() || !file2.canWrite()) {
            return null;
        }
        return new ofs(file2, z, file, str, screenshot, ofu).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static Screenshot a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, (int) axgy.b(), byteArrayOutputStream);
            return a(byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight());
        }
        Log.e("gH_Screenshot", "Screenshot is either null or recycled");
        return null;
    }

    public static Screenshot a(String str, int i, int i2) {
        Screenshot screenshot = new Screenshot();
        screenshot.a = i;
        screenshot.b = i2;
        screenshot.c = str;
        return screenshot;
    }

    public static Screenshot a(byte[] bArr, int i, int i2) {
        return a(Base64.encodeToString(bArr, 0), i, i2);
    }

    public static String a(File file, String str, Bitmap bitmap) {
        File file2 = new File(file, str);
        if (!file2.exists() && !file2.mkdirs()) {
            Log.e("gH_Screenshot", "failed to create reports directory");
            return null;
        } else if (bitmap != null && !bitmap.isRecycled()) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            File file3 = new File(file2, String.valueOf(valueOf).concat(".bmp"));
            for (File file4 : file2.listFiles()) {
                if (file4.getName().endsWith(".bmp") && !file4.getName().equals(file3.getName())) {
                    file4.delete();
                }
                if (file4.getName().equals(file3.getName())) {
                    return valueOf;
                }
            }
            try {
                new ofr(file3, bitmap).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]).get(axgy.a.a().v(), TimeUnit.MILLISECONDS);
                return valueOf;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                return null;
            }
        } else {
            Log.e("gH_Screenshot", "Cannot save. Bitmap is null or recycled.");
            return null;
        }
    }

    public static void a(ErrorReport errorReport, Screenshot screenshot) {
        errorReport.v = null;
        if (screenshot != null && !TextUtils.isEmpty(screenshot.c)) {
            errorReport.w = screenshot.b;
            errorReport.x = screenshot.a;
            errorReport.u = screenshot.c;
            return;
        }
        errorReport.w = 0;
        errorReport.x = 0;
        errorReport.u = null;
    }
}
