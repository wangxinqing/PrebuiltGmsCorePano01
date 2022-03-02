package defpackage;

import android.text.TextUtils;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Arrays;

/* renamed from: vdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdt {
    public final String a;
    public final ClientAppIdentifier b;

    private vdt(ClientAppIdentifier clientAppIdentifier, String str) {
        this.b = clientAppIdentifier;
        this.a = str;
    }

    public static vdt a(ClientAppIdentifier clientAppIdentifier, String str) {
        iva.b(!TextUtils.isEmpty(str), "PublishId cannot be null or empty");
        return new vdt(clientAppIdentifier, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.a, ((vdt) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("Unpublish(id=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
