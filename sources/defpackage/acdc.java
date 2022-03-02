package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: acdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acdc implements accl {
    public final Fragment a(int i, Bundle bundle) {
        if (i == 1) {
            ackh ackh = new ackh();
            if (bundle != null) {
                Bundle arguments = ackh.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putAll(bundle);
                ackh.setArguments(arguments);
            }
            return ackh;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Unknown fragment state: ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }
}
