package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.drive.internal.model.File;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* renamed from: lam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lam extends lbc {
    public lam(kyq kyq) {
        super(kyq, false, (lcv) null);
    }

    public static String a(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 85, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 10);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return null;
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) obj;
        throw new UnsupportedOperationException("Cannot convert a Bitmap metadata value directly to a Genoa query value.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        byte[] decode = Base64.decode(jSONObject.getString(this.b.a()), 8);
        return new BitmapTeleporter(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) obj;
        throw new UnsupportedOperationException("Cannot convert a Bitmap metadata value directly to a database value.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        String str;
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) obj;
        if (file.R == null) {
            file.R = new File.Thumbnail();
            file.a.add(71);
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
        File.Thumbnail thumbnail = file.R;
        thumbnail.b = a(bitmapTeleporter.a(), compressFormat);
        thumbnail.a.add(2);
        File.Thumbnail thumbnail2 = file.R;
        int i = lal.a[compressFormat.ordinal()];
        if (i == 1) {
            str = "image/jpeg";
        } else if (i == 2) {
            str = "image/png";
        } else if (i == 3) {
            str = "image/webp";
        } else {
            String valueOf = String.valueOf(compressFormat);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unexpected CompressFormat: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        thumbnail2.c = str;
        thumbnail2.a.add(3);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.b.a(), a(((BitmapTeleporter) obj).a(), Bitmap.CompressFormat.PNG));
    }
}
