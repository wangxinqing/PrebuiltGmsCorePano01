package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Filter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FilterHolder extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ljd();
    final ComparisonFilter a;
    final FieldOnlyFilter b;
    final LogicalFilter c;
    final NotFilter d;
    final InFilter e;
    final MatchAllFilter f;
    final HasFilter g;
    final FullTextSearchFilter h;
    final OwnedByMeFilter i;
    public final Filter j;

    public FilterHolder(Filter filter) {
        ComparisonFilter comparisonFilter;
        FieldOnlyFilter fieldOnlyFilter;
        LogicalFilter logicalFilter;
        NotFilter notFilter;
        InFilter inFilter;
        MatchAllFilter matchAllFilter;
        HasFilter hasFilter;
        FullTextSearchFilter fullTextSearchFilter;
        iva.a((Object) filter, (Object) "Null filter.");
        OwnedByMeFilter ownedByMeFilter = null;
        if (filter instanceof ComparisonFilter) {
            comparisonFilter = (ComparisonFilter) filter;
        } else {
            comparisonFilter = null;
        }
        this.a = comparisonFilter;
        if (filter instanceof FieldOnlyFilter) {
            fieldOnlyFilter = (FieldOnlyFilter) filter;
        } else {
            fieldOnlyFilter = null;
        }
        this.b = fieldOnlyFilter;
        if (filter instanceof LogicalFilter) {
            logicalFilter = (LogicalFilter) filter;
        } else {
            logicalFilter = null;
        }
        this.c = logicalFilter;
        if (filter instanceof NotFilter) {
            notFilter = (NotFilter) filter;
        } else {
            notFilter = null;
        }
        this.d = notFilter;
        if (filter instanceof InFilter) {
            inFilter = (InFilter) filter;
        } else {
            inFilter = null;
        }
        this.e = inFilter;
        if (filter instanceof MatchAllFilter) {
            matchAllFilter = (MatchAllFilter) filter;
        } else {
            matchAllFilter = null;
        }
        this.f = matchAllFilter;
        if (filter instanceof HasFilter) {
            hasFilter = (HasFilter) filter;
        } else {
            hasFilter = null;
        }
        this.g = hasFilter;
        if (filter instanceof FullTextSearchFilter) {
            fullTextSearchFilter = (FullTextSearchFilter) filter;
        } else {
            fullTextSearchFilter = null;
        }
        this.h = fullTextSearchFilter;
        ownedByMeFilter = filter instanceof OwnedByMeFilter ? (OwnedByMeFilter) filter : ownedByMeFilter;
        this.i = ownedByMeFilter;
        if (this.a == null && this.b == null && this.c == null && this.d == null && this.e == null && this.f == null && this.g == null && this.h == null && ownedByMeFilter == null) {
            throw new IllegalArgumentException("Invalid filter type.");
        }
        this.j = filter;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i2, false);
        ivx.a(parcel, 2, this.b, i2, false);
        ivx.a(parcel, 3, this.c, i2, false);
        ivx.a(parcel, 4, this.d, i2, false);
        ivx.a(parcel, 5, this.e, i2, false);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.a(parcel, 7, this.g, i2, false);
        ivx.a(parcel, 8, this.h, i2, false);
        ivx.a(parcel, 9, this.i, i2, false);
        ivx.b(parcel, a2);
    }

    public FilterHolder(ComparisonFilter comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter inFilter, MatchAllFilter matchAllFilter, HasFilter hasFilter, FullTextSearchFilter fullTextSearchFilter, OwnedByMeFilter ownedByMeFilter) {
        this.a = comparisonFilter;
        this.b = fieldOnlyFilter;
        this.c = logicalFilter;
        this.d = notFilter;
        this.e = inFilter;
        this.f = matchAllFilter;
        this.g = hasFilter;
        this.h = fullTextSearchFilter;
        this.i = ownedByMeFilter;
        if (comparisonFilter != null) {
            this.j = comparisonFilter;
        } else if (fieldOnlyFilter != null) {
            this.j = fieldOnlyFilter;
        } else if (logicalFilter != null) {
            this.j = logicalFilter;
        } else if (notFilter != null) {
            this.j = notFilter;
        } else if (inFilter != null) {
            this.j = inFilter;
        } else if (matchAllFilter != null) {
            this.j = matchAllFilter;
        } else if (hasFilter != null) {
            this.j = hasFilter;
        } else if (fullTextSearchFilter != null) {
            this.j = fullTextSearchFilter;
        } else if (ownedByMeFilter != null) {
            this.j = ownedByMeFilter;
        } else {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }
}
