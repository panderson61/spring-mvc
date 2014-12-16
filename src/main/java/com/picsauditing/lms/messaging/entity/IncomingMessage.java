package com.picsauditing.lms.messaging.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "incoming_message")
public class IncomingMessage extends Message {

}
