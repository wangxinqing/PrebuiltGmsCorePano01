package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import java.io.IOException;

/* renamed from: abln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abln extends jta {
    private final String c;

    public abln(Context context, String str) {
        super(context);
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            openAssetFileDescriptor = getContext().getContentResolver().openAssetFileDescriptor(Uri.parse(this.c), "r");
            Bitmap decodeStream = BitmapFactory.decodeStream(openAssetFileDescriptor.createInputStream(), (Rect) null, jpr.a());
            openAssetFileDescriptor.close();
            return decodeStream;
        } catch (IOException e) {
            return null;
        } catch (Throwable th) {
            openAssetFileDescriptor.close();
            throw th;
        }
    }
}
