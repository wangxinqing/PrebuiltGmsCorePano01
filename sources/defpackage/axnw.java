package defpackage;

/* renamed from: axnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axnw implements axnv {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__enable_need_more_help_in_search_results", false);
        agvx.a(a2, "AndroidGoogleHelp__enable_smart_journey", true);
        b = agvx.a(a2, "AndroidGoogleHelp__smart_journey_injected_js", "<script>window.get_help = function(page) {    var getHelpFlow = page.getChild();    if (typeof getHelpFlow === 'undefined') {        return;    }    getHelpFlow.getFormFlowStep().getEmbeddedForm()        .setContactFormCallback(function(form) {            form.setProductSpecificData(activity.getPsd());            form.listen('beforesubmit', function() {                form.setGcmRegistrationId(                    activity.getGcmRegistrationId());            });            form.listen('submitend', function() {                activity.onSubmit(form.getContactType(),                  form.getChatPoolId(),                  form.getCaseId());            });            form.listen('error', function() {                activity.onSubmitError(                    form.getContactType());            });    });};</script>");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
