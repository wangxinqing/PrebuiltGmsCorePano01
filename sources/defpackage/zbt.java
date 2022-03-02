package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.plus.service.ImageChimeraIntentService;
import java.io.IOException;

/* renamed from: zbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbt implements hcy {
    private final iqm a;
    private final Uri b;
    private final int c;
    private final yth d;

    public zbt(iqm iqm, Uri uri, int i, yth yth) {
        this.a = iqm;
        this.b = uri;
        this.c = i;
        this.d = yth;
    }

    private final void a(int i, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.d.a(i, (Bundle) null, parcelFileDescriptor);
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e) {
                    Log.e("LoadImageOperation", "Failed close", e);
                }
            }
        } catch (Throwable th) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e2) {
                    Log.e("LoadImageOperation", "Failed close", e2);
                }
            }
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ void a(hdd hdd) {
        ImageChimeraIntentService imageChimeraIntentService = (ImageChimeraIntentService) hdd;
        Uri uri = this.b;
        int i = this.c;
        if (i != 0) {
            uri = uri.buildUpon().appendQueryParameter("bounding_box", Integer.toString(i)).build();
        }
        AssetFileDescriptor a2 = this.a.a((Context) imageChimeraIntentService, uri);
        if (a2 == null) {
            a(8, (ParcelFileDescriptor) null);
        } else {
            a(0, a2.getParcelFileDescriptor());
        }
    }
}
