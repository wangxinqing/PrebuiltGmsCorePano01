package defpackage;

import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: wox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wox extends wpa {
    protected final AvatarReference a;
    protected final ParcelableLoadImageOptions b;

    public wox(String str, int i, wmq wmq, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions, String str2) {
        super(str, i, wmq, str2);
        this.a = avatarReference;
        this.b = parcelableLoadImageOptions;
    }

    /* access modifiers changed from: protected */
    public void a() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("[avatar ref=");
        sb.append(valueOf);
        sb.append("]");
        sb.toString();
    }
}
