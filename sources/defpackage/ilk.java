package defpackage;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: ilk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ilk extends ile {
    private static final String[] b = {"data"};
    private final Parcelable.Creator c;

    public ilk(DataHolder dataHolder, Parcelable.Creator creator) {
        super(dataHolder);
        this.c = creator;
    }

    public static void a(ilm ilm, SafeParcelable safeParcelable) {
        Parcel obtain = Parcel.obtain();
        safeParcelable.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", obtain.marshall());
        ilm.a(contentValues);
        obtain.recycle();
    }

    public static ilm d() {
        return DataHolder.a(b);
    }

    /* renamed from: b */
    public SafeParcelable a(int i) {
        DataHolder dataHolder = this.a;
        byte[] e = dataHolder.e("data", i, dataHolder.a(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(e, 0, e.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) this.c.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
