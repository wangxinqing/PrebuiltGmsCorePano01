package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.FullTextSearchFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.OwnedByMeFilter;

/* renamed from: ljd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FilterHolder[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ComparisonFilter comparisonFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        LogicalFilter logicalFilter = null;
        NotFilter notFilter = null;
        InFilter inFilter = null;
        MatchAllFilter matchAllFilter = null;
        HasFilter hasFilter = null;
        FullTextSearchFilter fullTextSearchFilter = null;
        OwnedByMeFilter ownedByMeFilter = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    comparisonFilter = (ComparisonFilter) ivw.a(parcel, readInt, (Parcelable.Creator) ComparisonFilter.CREATOR);
                    break;
                case 2:
                    fieldOnlyFilter = (FieldOnlyFilter) ivw.a(parcel, readInt, FieldOnlyFilter.CREATOR);
                    break;
                case 3:
                    logicalFilter = (LogicalFilter) ivw.a(parcel, readInt, LogicalFilter.CREATOR);
                    break;
                case 4:
                    notFilter = (NotFilter) ivw.a(parcel, readInt, NotFilter.CREATOR);
                    break;
                case 5:
                    inFilter = (InFilter) ivw.a(parcel, readInt, (Parcelable.Creator) InFilter.CREATOR);
                    break;
                case 6:
                    matchAllFilter = (MatchAllFilter) ivw.a(parcel, readInt, MatchAllFilter.CREATOR);
                    break;
                case 7:
                    hasFilter = (HasFilter) ivw.a(parcel, readInt, (Parcelable.Creator) HasFilter.CREATOR);
                    break;
                case 8:
                    fullTextSearchFilter = (FullTextSearchFilter) ivw.a(parcel, readInt, FullTextSearchFilter.CREATOR);
                    break;
                case 9:
                    ownedByMeFilter = (OwnedByMeFilter) ivw.a(parcel, readInt, OwnedByMeFilter.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new FilterHolder(comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter, matchAllFilter, hasFilter, fullTextSearchFilter, ownedByMeFilter);
    }
}
