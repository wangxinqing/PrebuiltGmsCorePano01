package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ardj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardj {
    static {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.unmodifiableList(arrayList);
    }

    public static String a(int i) {
        if (i == 16) {
            return "in_road_vehicle";
        }
        if (i == 17) {
            return "in_rail_vehicle";
        }
        switch (i) {
            case 0:
                return "in_vehicle";
            case 1:
                return "on_bicycle";
            case 2:
                return "on_foot";
            case 3:
                return "still";
            case 4:
                return "unknown";
            case 5:
                return "tilting";
            case 6:
                return "exiting_vehicle";
            case 7:
                return "walking";
            case 8:
                return "running";
            default:
                StringBuilder sb = new StringBuilder(34);
                sb.append("Unknown activity type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
