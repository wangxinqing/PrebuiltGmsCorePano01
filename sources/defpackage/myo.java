package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

/* renamed from: myo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myo {
    public static Bundle a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    public static String b() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("_");
        sb.append(abs);
        return sb.toString();
    }

    @Deprecated
    public static String a() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        return sb.toString();
    }

    public static String a(Account account) {
        return Integer.toString(account.name.toLowerCase(Locale.ENGLISH).hashCode());
    }

    public static void a(Context context, mum mum, long j) {
        a((Runnable) new myf(context, mum, j));
        a((Runnable) new myg(context, mum, j));
    }

    public static void a(Bundle bundle) {
        if (((Boolean) myq.e.a()).booleanValue() && bundle != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeBundle(bundle);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > ((Integer) myq.d.a()).intValue()) {
                String valueOf = String.valueOf(myq.d.a());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86);
                sb.append("Max allowed bundle size of ");
                sb.append(valueOf);
                sb.append(" exceeded, you are passing in a bundle of ");
                sb.append(dataSize);
                sb.append(" size.");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public static void a(FeedbackOptions feedbackOptions) {
        if (((Boolean) myq.e.a()).booleanValue() && feedbackOptions != null) {
            Parcel obtain = Parcel.obtain();
            mwe.a(feedbackOptions, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > ((Integer) myq.d.a()).intValue()) {
                String valueOf = String.valueOf(myq.d.a());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 104);
                sb.append("Max allowed feedback options size of ");
                sb.append(valueOf);
                sb.append(" exceeded, you are passing in feedback options of ");
                sb.append(dataSize);
                sb.append(" size.");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    private static void a(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }
}
