package com.thiru.techm.messanger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thiru.techm.messanger.model.Message;
import com.thiru.techm.messanger.services.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService messageService=new MessageService();
	@GET

	public List<Message> getMessages()

	{
		return messageService.getAllMessage();
	}
	@POST
	public Message addMessage(Message message)
	{
		return messageService.addMessage(message);
	}
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long id)
	{
		return messageService.getMessage(id);
	}
	@DELETE
	@Path("/{messageId}")
	public Message removeMessage(@PathParam("messageId") long id)
	{
		return messageService.removeMessage(id);
	}
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long id,Message message)
	{
		message.setId(id);
		return messageService.updateMessage(message);
	}
}
