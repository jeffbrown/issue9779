class UrlMappings {

	static mappings = {
		"/api/$apiVersion/admin/reportingCohort"(controller: 'reportingCohort') {
            action = [GET: "index"]
        }
        "/api/$apiVersion/admin/reportingCohort/$id"(controller: 'reportingCohort') {
            action = [PUT: "update", DELETE: "delete"]
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
