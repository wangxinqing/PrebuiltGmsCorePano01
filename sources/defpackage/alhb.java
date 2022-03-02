package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import java.util.EnumMap;

/* renamed from: alhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhb {
    private static final String c = alhb.class.getSimpleName();
    private static alhb d = null;
    public Bundle a = null;
    public final EnumMap b = new EnumMap(alha.class);

    private alhb(Context context) {
        Bundle bundle = this.a;
        if (bundle == null || bundle.isEmpty()) {
            try {
                this.a = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").appendPath("getOverlayConfig").build(), "getOverlayConfig", (String) null, (Bundle) null);
                this.b.clear();
            } catch (IllegalArgumentException e) {
                Log.w(c, "Fail to get config from suw provider");
            }
        }
    }

    private static final float a(Context context, TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public final Drawable b(Context context, alha alha) {
        if (alha.N != 3) {
            throw new IllegalArgumentException("Not a drawable resource");
        } else if (this.b.containsKey(alha)) {
            return (Drawable) this.b.get(alha);
        } else {
            try {
                alhc a2 = a(context, alha.M);
                Resources resources = a2.b;
                int i = a2.a;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                if (typedValue.type == 1 && typedValue.data == 0) {
                    return null;
                }
                int i2 = Build.VERSION.SDK_INT;
                Drawable drawable = resources.getDrawable(i, (Resources.Theme) null);
                this.b.put(alha, drawable);
                return drawable;
            } catch (Resources.NotFoundException | NullPointerException e) {
                return null;
            }
        }
    }

    public final String c(Context context, alha alha) {
        if (alha.N != 4) {
            throw new IllegalArgumentException("Not a string resource");
        } else if (this.b.containsKey(alha)) {
            return (String) this.b.get(alha);
        } else {
            try {
                alhc a2 = a(context, alha.M);
                String string = a2.b.getString(a2.a);
                try {
                    this.b.put(alha, string);
                    return string;
                } catch (NullPointerException e) {
                    return string;
                }
            } catch (NullPointerException e2) {
                return null;
            }
        }
    }

    public final boolean d(Context context, alha alha) {
        if (alha.N != 1) {
            throw new IllegalArgumentException("Not a bool resource");
        } else if (this.b.containsKey(alha)) {
            return ((Boolean) this.b.get(alha)).booleanValue();
        } else {
            try {
                alhc a2 = a(context, alha.M);
                boolean z = a2.b.getBoolean(a2.a);
                try {
                    this.b.put(alha, Boolean.valueOf(z));
                    return z;
                } catch (NullPointerException e) {
                    return z;
                }
            } catch (NullPointerException e2) {
                return false;
            }
        }
    }

    public final float e(Context context, alha alha) {
        if (alha.N != 5) {
            throw new IllegalArgumentException("Not a dimension resource");
        } else if (this.b.containsKey(alha)) {
            return a(context, (TypedValue) this.b.get(alha));
        } else {
            try {
                alhc a2 = a(context, alha.M);
                Resources resources = a2.b;
                int i = a2.a;
                try {
                    TypedValue typedValue = new TypedValue();
                    resources.getValue(i, typedValue, true);
                    if (typedValue.type == 5) {
                        this.b.put(alha, typedValue);
                        return a(context, (TypedValue) this.b.get(alha));
                    }
                    String hexString = Integer.toHexString(i);
                    String hexString2 = Integer.toHexString(typedValue.type);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(hexString2).length());
                    sb.append("Resource ID #0x");
                    sb.append(hexString);
                    sb.append(" type #0x");
                    sb.append(hexString2);
                    sb.append(" is not valid");
                    throw new Resources.NotFoundException(sb.toString());
                } catch (NullPointerException e) {
                    return resources.getDimension(i);
                }
            } catch (NullPointerException e2) {
                return 0.0f;
            }
        }
    }

    public static synchronized alhb a(Context context) {
        alhb alhb;
        synchronized (alhb.class) {
            if (d == null) {
                d = new alhb(context);
            }
            alhb = d;
        }
        return alhb;
    }

    public final int a(Context context, alha alha) {
        int i;
        if (alha.N != 2) {
            throw new IllegalArgumentException("Not a color resource");
        } else if (this.b.containsKey(alha)) {
            return ((Integer) this.b.get(alha)).intValue();
        } else {
            try {
                alhc a2 = a(context, alha.M);
                Resources resources = a2.b;
                int i2 = a2.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    i = resources.getColor(i2, (Resources.Theme) null);
                } else {
                    i = resources.getColor(i2);
                }
                try {
                    this.b.put(alha, Integer.valueOf(i));
                    return i;
                } catch (NullPointerException e) {
                    return i;
                }
            } catch (NullPointerException e2) {
                return 0;
            }
        }
    }

    public final alhc a(Context context, String str) {
        Bundle bundle = this.a.getBundle(str);
        Bundle bundle2 = this.a.getBundle("fallbackConfig");
        if (bundle2 != null) {
            bundle.putBundle("fallbackConfig", bundle2.getBundle(str));
        }
        return alhc.a(context, bundle);
    }
}
