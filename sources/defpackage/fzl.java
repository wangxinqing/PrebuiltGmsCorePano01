package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: fzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fzl {
    public final Bundle a;

    public fzl() {
        this((Bundle) null);
    }

    public final Object a(fzk fzk) {
        return this.a.get(fzk.a);
    }

    public final void b(fzk fzk, Object obj) {
        Bundle bundle = this.a;
        if (obj == null) {
            bundle.putString(fzk.a, (String) null);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(fzk.a, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(fzk.a, (boolean[]) obj);
        } else if (obj instanceof Byte) {
            bundle.putByte(fzk.a, ((Byte) obj).byteValue());
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(fzk.a, (byte[]) obj);
        } else if (obj instanceof CharSequence) {
            bundle.putCharSequence(fzk.a, (CharSequence) obj);
        } else if (obj instanceof CharSequence[]) {
            bundle.putCharSequenceArray(fzk.a, (CharSequence[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(fzk.a, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(fzk.a, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(fzk.a, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(fzk.a, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(fzk.a, (String) obj);
        } else if (obj instanceof String[]) {
            bundle.putStringArray(fzk.a, (String[]) obj);
        } else if (obj instanceof Bundle) {
            bundle.putBundle(fzk.a, (Bundle) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(fzk.a, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            bundle.putParcelableArray(fzk.a, (Parcelable[]) obj);
        } else {
            String valueOf = String.valueOf(obj.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Class of value unsupported: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public fzl(Bundle bundle) {
        this.a = bundle == null ? new Bundle() : bundle;
    }

    public final Object a(fzk fzk, Object obj) {
        return b(fzk) ? a(fzk) : obj;
    }

    public final boolean b(fzk fzk) {
        return this.a.containsKey(fzk.a);
    }
}
