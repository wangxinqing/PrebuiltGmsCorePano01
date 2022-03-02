package defpackage;

import android.content.Context;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: wpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpi extends wox {
    public wpi(String str, int i, wmq wmq, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        super(str, i, wmq, avatarReference, parcelableLoadImageOptions, "LoadAvatarByReferenceCp2Focus");
    }

    /* access modifiers changed from: protected */
    public final byte[] d(Context context) {
        String str;
        String str2;
        AvatarReference avatarReference;
        xip.a();
        if (((Boolean) xgs.a.a()).booleanValue()) {
            if (this.a.a()) {
                avatarReference = xfd.c(this.a);
            } else {
                avatarReference = this.a;
            }
            str = avatarReference.e;
            str2 = avatarReference.f;
        } else {
            AvatarReference avatarReference2 = this.a;
            iva.a((Object) avatarReference2);
            str = xfd.e(avatarReference2.a, avatarReference2.b);
            AvatarReference avatarReference3 = this.a;
            iva.a((Object) avatarReference3);
            str2 = xfd.f(avatarReference3.a, avatarReference3.b);
        }
        long a = wto.a(context, str, str2);
        if (a >= 0) {
            return wto.a(context, a, !this.b.c);
        }
        return null;
    }
}
