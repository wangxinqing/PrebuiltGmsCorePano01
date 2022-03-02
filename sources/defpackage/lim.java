package defpackage;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.Collections;

/* renamed from: lim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lim {
    public static Filter a(Filter filter) {
        iva.a((Object) filter, (Object) "Filter may not be null");
        return new NotFilter(new FilterHolder(filter));
    }

    public static Filter a(kys kys, Object obj) {
        iva.a((Object) kys, (Object) "Field may not be null.");
        iva.a(obj, (Object) "Value may not be null.");
        return new InFilter(MetadataBundle.a(kys, Collections.singleton(obj)));
    }

    public static Filter a(kyt kyt, Object obj) {
        iva.a((Object) kyt, (Object) "Field may not be null.");
        iva.a(obj, (Object) "Value may not be null.");
        return new ComparisonFilter(Operator.a, MetadataBundle.a(kyt, obj));
    }
}
