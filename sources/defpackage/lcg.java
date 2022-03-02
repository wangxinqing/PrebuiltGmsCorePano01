package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import java.util.Arrays;

/* renamed from: lcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lcg extends lbs implements kyt {
    public static final lbl c = new lcf();

    public lcg() {
        super("customProperties", Arrays.asList(new String[]{"hasCustomProperties", "sqlId"}), Arrays.asList(new String[]{"customPropertiesExtra", "customPropertiesExtraHolder"}), 5000000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        lbh lbh = new lbh();
        lbh.a((AppVisibleCustomProperties) obj2);
        lbh.a((AppVisibleCustomProperties) obj);
        return lbh.a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        String str;
        DataHolder dataHolder2 = dataHolder;
        Bundle bundle = dataHolder2.f;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("customPropertiesExtra");
        if (sparseParcelableArray == null) {
            if (bundle.getParcelable("customPropertiesExtraHolder") != null) {
                synchronized (dataHolder) {
                    DataHolder dataHolder3 = (DataHolder) dataHolder2.f.getParcelable("customPropertiesExtraHolder");
                    if (dataHolder3 != null) {
                        try {
                            Bundle bundle2 = dataHolder3.f;
                            String string = bundle2.getString("entryIdColumn");
                            String string2 = bundle2.getString("keyColumn");
                            String string3 = bundle2.getString("visibilityColumn");
                            String string4 = bundle2.getString("valueColumn");
                            oh ohVar = new oh();
                            for (int i3 = 0; i3 < dataHolder3.h; i3++) {
                                int a = dataHolder3.a(i3);
                                long a2 = dataHolder3.a(string, i3, a);
                                String c2 = dataHolder3.c(string2, i3, a);
                                int b = dataHolder3.b(string3, i3, a);
                                CustomProperty customProperty = new CustomProperty(new CustomPropertyKey(c2, b), dataHolder3.c(string4, i3, a));
                                lbh lbh = (lbh) ohVar.a(a2);
                                if (lbh == null) {
                                    lbh = new lbh();
                                    ohVar.b(a2, lbh);
                                }
                                lbh.a(customProperty);
                            }
                            SparseArray sparseArray = new SparseArray();
                            for (int i4 = 0; i4 < dataHolder2.h; i4++) {
                                lbh lbh2 = (lbh) ohVar.a(dataHolder2.a("sqlId", i4, dataHolder2.a(i4)));
                                if (lbh2 != null) {
                                    sparseArray.append(i4, lbh2.a());
                                }
                            }
                            dataHolder2.f.putSparseParcelableArray("customPropertiesExtra", sparseArray);
                        } finally {
                            dataHolder3.close();
                            str = "customPropertiesExtraHolder";
                            dataHolder2.f.remove(str);
                        }
                    }
                }
                sparseParcelableArray = bundle.getSparseParcelableArray("customPropertiesExtra");
            }
            if (sparseParcelableArray == null) {
                return AppVisibleCustomProperties.a;
            }
        }
        return (AppVisibleCustomProperties) sparseParcelableArray.get(i, AppVisibleCustomProperties.a);
    }
}
