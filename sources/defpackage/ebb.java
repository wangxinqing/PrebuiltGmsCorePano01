package defpackage;

/* renamed from: ebb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ebb {
    CLIENT_CONTEXTS("client_contexts"),
    CLIENT_CONTEXTS_ID("client_contexts/#"),
    APP_STATES("app_states/#"),
    APP_STATES_ID("app_states/internal_id/#"),
    APP_STATES_APP_ID("app_states/#/app_id/*"),
    APP_STATES_ACCOUNT_NAME("app_states/account_name/*");
    
    public final String g;

    private ebb(String str) {
        this.g = str;
    }
}
