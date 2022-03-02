package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TextAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new vtu();
    public final String a;
    public final int b;
    public final long c;
    public final Bundle d;

    public TextAttachment(String str, int i, long j, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = bundle;
    }

    public final long a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextAttachment) {
            TextAttachment textAttachment = (TextAttachment) obj;
            return ius.a(this.a, textAttachment.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(textAttachment.b)) && ius.a(Long.valueOf(this.c), Long.valueOf(textAttachment.c));
        }
    }

    public final int f() {
        return 3;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        return String.format(Locale.US, "TextAttachment<textBody: %s, type: %s, size: %s>", new Object[]{this.a, Integer.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
