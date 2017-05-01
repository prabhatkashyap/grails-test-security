package grails.test.security

import grails.rest.RestfulController
import groovy.transform.CompileStatic

@CompileStatic
class ApiAnnouncementController extends RestfulController {
    static responseFormats = ['json']

    ApiAnnouncementController() {
        super(Announcement)
    }
}
