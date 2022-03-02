package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.profile.AvatarChimeraActivity;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.OutputStream;

/* renamed from: xit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xit implements icm {
    final /* synthetic */ AvatarChimeraActivity a;

    public xit(AvatarChimeraActivity avatarChimeraActivity) {
        this.a = avatarChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        OutputStream outputStream;
        Bitmap bitmap;
        wlj wlj = (wlj) icl;
        Status aO = wlj.aO();
        ParcelFileDescriptor b = wlj.b();
        try {
            outputStream = null;
            if (!aO.c()) {
                bitmap = null;
            } else {
                bitmap = b != null ? wlu.a(b) : null;
            }
            if (bitmap == null) {
                Log.w("People.Avatar", "Failed to decode remote photo");
                this.a.f();
                this.a.d();
            } else {
                Uri a2 = xix.a(this.a, "remote-avatar.jpg");
                if (a2 == null) {
                    Log.w("People.Avatar", "Failed to get temp file for remote photo");
                    this.a.f();
                    this.a.d();
                } else {
                    try {
                        outputStream = this.a.getContentResolver().openOutputStream(a2);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, (int) aywy.j(), outputStream);
                            AvatarChimeraActivity avatarChimeraActivity = this.a;
                            avatarChimeraActivity.d = a2;
                            avatarChimeraActivity.a(avatarChimeraActivity.d);
                        } catch (FileNotFoundException e) {
                            e = e;
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        Log.e("People.Avatar", "Failed to compress remove photo to temp file", e);
                        jjt.a((Closeable) outputStream);
                        jjt.a(b);
                    } catch (Throwable th) {
                        th = th;
                        jjt.a((Closeable) outputStream);
                        throw th;
                    }
                    jjt.a((Closeable) outputStream);
                }
            }
            jjt.a(b);
        } catch (Throwable th2) {
            jjt.a(b);
            throw th2;
        }
    }
}
