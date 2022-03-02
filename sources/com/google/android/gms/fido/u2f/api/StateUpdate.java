package com.google.android.gms.fido.u2f.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nbk();
    public static final StateUpdate a = new StateUpdate(Type.PAUSE);
    public static final StateUpdate b = new StateUpdate(Type.RESUME);
    public static final StateUpdate c = new StateUpdate(Type.STOP);
    public final String d;
    private final Type e;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum Type implements Parcelable {
        CANCEL("cancel"),
        PAUSE("pause"),
        RESUME("resume"),
        STOP("stop"),
        DEVICE_SELECTION("user_selected_device"),
        SELECT_VIEW("user_selected_view"),
        SELECT_TRANSPORT_VIEW("user_selected_view_for_transport"),
        UPDATE_CURRENT_VIEW("update_current_view");
        
        public static final Parcelable.Creator CREATOR = null;
        public final String i;

        static {
            CREATOR = new nbi();
        }

        private Type(String str) {
            this.i = str;
        }

        public static Type a(String str) {
            for (Type type : values()) {
                if (str.equals(type.i)) {
                    return type;
                }
            }
            throw new nbj(str);
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return this.i;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.i);
        }
    }

    static {
        new StateUpdate(Type.CANCEL);
    }

    public StateUpdate(Type type) {
        this(type, (JSONObject) null);
    }

    public static StateUpdate a(JSONObject jSONObject) {
        if (jSONObject.has("type")) {
            Type a2 = Type.a(jSONObject.getString("type"));
            if (a2.equals(Type.CANCEL) || a2.equals(Type.PAUSE) || a2.equals(Type.RESUME) || a2.equals(Type.STOP)) {
                return new StateUpdate(a2);
            }
            if (jSONObject.has("data")) {
                try {
                    return new StateUpdate(a2, jSONObject.getJSONObject("data"));
                } catch (JSONException e2) {
                    throw new JSONException("malformed required field \"data\"");
                }
            } else {
                String valueOf = String.valueOf(a2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Missing required field \"data\" for \"type\"");
                sb.append(valueOf);
                throw new JSONException(sb.toString());
            }
        } else {
            throw new JSONException("Missing required field \"type\"");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StateUpdate) {
            StateUpdate stateUpdate = (StateUpdate) obj;
            return ius.a(this.e, stateUpdate.e) && ius.a(this.d, stateUpdate.d);
        }
    }

    public final int hashCode() {
        Type type = this.e;
        Type type2 = Type.CANCEL;
        return Arrays.hashCode(new Object[]{type.i, this.d});
    }

    public StateUpdate(Type type, JSONObject jSONObject) {
        iva.a((Object) type);
        this.e = type;
        if (jSONObject == null) {
            boolean z = true;
            if (!type.equals(Type.CANCEL) && !type.equals(Type.PAUSE) && !type.equals(Type.RESUME) && !type.equals(Type.STOP)) {
                z = false;
            }
            iva.b(z);
            this.d = null;
            return;
        }
        this.d = jSONObject.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        Type type = this.e;
        Type type2 = Type.CANCEL;
        ivx.a(parcel, 2, type.i, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.b(parcel, a2);
    }

    public StateUpdate(String str, String str2) {
        try {
            this.e = Type.a(str);
            this.d = str2;
        } catch (nbj e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
