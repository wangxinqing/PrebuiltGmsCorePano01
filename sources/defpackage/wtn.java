package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;

/* renamed from: wtn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wtn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BackupAndSyncSuggestion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new BackupAndSyncSuggestion(i);
    }
}