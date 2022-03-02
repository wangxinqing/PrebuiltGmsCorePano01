package com.google.android.gms.drive.events;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CompletionEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new kso();
    final DriveId a;
    final String b;
    final ParcelFileDescriptor c;
    final ParcelFileDescriptor d;
    final MetadataBundle e;
    final List f;
    final int g;
    final IBinder h;

    static {
        new ith("CompletionEvent", "");
    }

    public CompletionEvent(DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, Context context, List list, int i, IBinder iBinder) {
        this(driveId, str, parcelFileDescriptor, parcelFileDescriptor2, metadataBundle, list, i, iBinder);
        if (metadataBundle != null) {
            metadataBundle.a(context);
        }
    }

    public final int a() {
        return 2;
    }

    public final String toString() {
        String str;
        List list = this.f;
        if (list != null) {
            String join = TextUtils.join("','", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("'");
            sb.append(join);
            sb.append("'");
            str = sb.toString();
        } else {
            str = "<null>";
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[]{this.a, Integer.valueOf(this.g), str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i | 1;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i2, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i2, false);
        ivx.a(parcel, 5, this.d, i2, false);
        ivx.a(parcel, 6, this.e, i2, false);
        ivx.b(parcel, 7, this.f, false);
        ivx.b(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h);
        ivx.b(parcel, a2);
    }

    public CompletionEvent(DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, List list, int i, IBinder iBinder) {
        this.a = driveId;
        this.b = str;
        this.c = parcelFileDescriptor;
        this.d = parcelFileDescriptor2;
        this.e = metadataBundle;
        this.f = list;
        this.g = i;
        this.h = iBinder;
    }
}
