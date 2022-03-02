package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StatsReport {
    public final String a;
    public final String b;
    public final double c;
    public final Value[] d;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Value {
        public final String a;
        public final String b;

        public Value(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String toString() {
            return "[" + this.a + ": " + this.b + "]";
        }
    }

    public StatsReport(String str, String str2, double d2, Value[] valueArr) {
        this.a = str;
        this.b = str2;
        this.c = d2;
        this.d = valueArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(this.a);
        sb.append(", type: ");
        sb.append(this.b);
        sb.append(", timestamp: ");
        sb.append(this.c);
        sb.append(", values: ");
        int i = 0;
        while (true) {
            Value[] valueArr = this.d;
            if (i >= valueArr.length) {
                return sb.toString();
            }
            sb.append(valueArr[i].toString());
            sb.append(", ");
            i++;
        }
    }
}
